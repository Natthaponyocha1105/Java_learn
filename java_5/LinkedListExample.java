import java.util.LinkedList;

public class LinkedListExample {
    public static  void main(String[] args){
        LinkedList<String> animalLIFO = new LinkedList<>();
        LinkedList<String> personQueue = new LinkedList<>();

        //ใช้เป็ฯ Stack (LIFO: Last in First Out)
        animalLIFO.push("Dog");
        animalLIFO.push("Cat");
        animalLIFO.push("Bird");

        //แสดงผล
        System.out.println(animalLIFO);

        animalLIFO.pop();
        System.out.println(animalLIFO);

        //ใช้เป็น Queue (FIFO: First In First Out)
        personQueue.offer("Somchai");
        personQueue.offer("Somying");
        personQueue.offer("Somsri");
        System.out.println(personQueue);
        personQueue.poll();
        System.out.println(personQueue);
        personQueue.poll();
        System.out.println(personQueue);
    }
}
