
import java.util.*;

public class DequeExample {

    public static void main(String[] args) {

        Deque<String> myDeque = new ArrayDeque<>();
        Deque<String> secondDeque = new LinkedList<>();

        myDeque.addLast("Twitch");
        myDeque.addFirst("YouTube");
        myDeque.offerFirst("FaceBook");
        myDeque.offerLast("My Stream");
        myDeque.addLast("Instagram");
        myDeque.addFirst("Twitter");
        myDeque.offerFirst("Discord");
        myDeque.offerLast("Banned.video");

        printDeque(myDeque);

        // Peek first and last
        System.out.println("Do some peeking");
        System.out.println("Peek first: " + myDeque.peekFirst());
        System.out.println("Peek last: " + myDeque.peekLast());

        // Pop takes from head returns the card
        System.out.println("Pop: " + myDeque.pop());
        

        // peek again
        System.out.println(myDeque.peekFirst());
        System.out.println(myDeque.peekLast());

        // poll will remove head and return null if empty
        System.out.println("Poll() method: " + myDeque.pollFirst());
        System.out.println("PollLast() method: " + myDeque.pollLast());
        printDeque(myDeque);

        // Remove first and last throws exception if deque is empty
        System.out.println("Remove first: " + myDeque.removeFirst());
        System.out.println("Remove Last: " + myDeque.removeLast());

        // pushes to the head and throws exception if no space available
        myDeque.push("Sandbox");
        printDeque(myDeque);

        // create ArrayList<String>() to add to the deque
        ArrayList<String> myAdditions = new ArrayList<>();
        myAdditions.add("Rogue");
        myAdditions.add("TicToc");
        myAdditions.add("Blender");
        myDeque.addAll(myAdditions);

        printDeque(myDeque);
    }

    private static void printDeque(Deque<String> myDeque) {
        System.out.println("\nAll the cards in the deque:");
        for (var card:
                myDeque) {
            System.out.println(card);
        }
        System.out.println("\n");
    }
}
