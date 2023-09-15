import java.util.*;
public class HashMap_Implementation {
    static class HashMap<K,V>{ //GENERIC
        private class Node {
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n - n number of Node
        private int N;
        private LinkedList<Node> buckets[]; //N - Array size

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i =0; i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc)% N;
        }

        private int SerchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int dataindex = 0;


            for(int i =0; i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return dataindex;
                }
                dataindex++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;

            for(int i =0; i< buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }


            //nodes -> add in bucket

            for(int i=0; i<oldBucket.length;i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j =0; j<ll.size();j++){
                    Node node= ll.remove();
                    put(node.key, node.value);
                }
            }
        }


        public void put(K key, V value){ // TIME COMPLECXITY - 0(LAMBDA) ->0(1)
              int bucketindex = hashFunction(key); //index value in between 0-3 size 1
              int dataindex = SerchInLL(key,bucketindex); //Valid index return if not there return -1;

            if(dataindex != -1){
                Node node = buckets[bucketindex].get(dataindex);
                node.value = value;
            }else{
                buckets[bucketindex].add(new Node(key,value));
                  n++;
            }

           double lambda =n/N;
            if(lambda >2.0){
                rehash();
            }
        }

        public boolean containsKey(K key){ //Tc - 0(1)
            int bucketindex = hashFunction(key); //index value in between 0-3 size 1
            int dataindex = SerchInLL(key,bucketindex); //Valid index return if not there return -1;

            if(dataindex != -1){
                return true;
            }else{
               return false;
            }
        }

        public V remove(K key){  //Tc - 0(1)
            int bucketindex = hashFunction(key); //index value in between 0-3 size 1
            int dataindex = SerchInLL(key,bucketindex); //Valid index return if not there return -1;

            if(dataindex != -1){
                Node node = buckets[bucketindex].remove(dataindex);
                n--;
                return node.value;
            }else{
                return null;
            }
        }

        public V get(K key){ //Tc - 0(1)
            int bucketindex = hashFunction(key); //index value in between 0-3 size 1
            int dataindex = SerchInLL(key,bucketindex); //Valid index return if not there return -1;

            if(dataindex != -1){
                Node node = buckets[bucketindex].get(dataindex);
                return node.value;
            }else{
                return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i =0; i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for (Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return  n==0;
        }

    }

    public static void main(String[] args) {
        HashMap <String, Integer> hm = new HashMap<>();
        hm.put("Indeia" ,100);
        hm.put("sikim", 500);

        ArrayList<String> keys = hm.keySet();
        for (String key:keys
             ) {
            System.out.println(key);
        }
    }
}
