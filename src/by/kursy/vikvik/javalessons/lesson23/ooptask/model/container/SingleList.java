package by.kursy.vikvik.javalessons.lesson23.ooptask.model.container;

import by.kursy.vikvik.javalessons.lesson23.ooptask.entity.Flower;

class FlowerNode {
    public Flower value;
    public FlowerNode next;
}

public class SingleList extends AbstractContainer {
    private FlowerNode first;

    public SingleList(){
        first = new FlowerNode();
    }

    public SingleList(Flower[] flowers){
        first = new FlowerNode();
        FlowerNode temp = first;

        for (int i = 0; i < flowers.length - 1; i++) {
            temp.value = flowers[i];
            temp.next = new FlowerNode();
            temp = temp.next;
        }

        temp.value = flowers[flowers.length - 1];
        temp.next = null;
    }

    public int size(){
        if (first.value == null) {
           return 0;
        }
        
        int count = 0;

        FlowerNode temp = first;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public Flower get(int index) {
        int count = 0;

        FlowerNode temp = first;

        while(temp != null){
            if (index == count) {
                break;
            }

            temp = temp.next;
            count++;
        }

        return temp.value;
    }

    @Override
    public void set(int index, Flower flower) {
        int count = 0;

        FlowerNode temp = first;

        while(temp != null){
            if (index == count) {
                break;
            }

            temp = temp.next;
            count++;
        }

        temp.value = flower;
    }

    public void add(Flower flower){
        FlowerNode temp = first;

        if (first.value == null) {
            first.value = flower;
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }

        FlowerNode node = new FlowerNode();
        node.value = flower;
        temp.next = node;
    }

   public void remove(int index) {
        int count = 0;

        if (index == 0) {
            first = first.next;
            return;
        }

        FlowerNode temp = first;

        while (temp != null) {
            count++;

            if (index == count) {
            if (index - 1 == count) {
                FlowerNode previous = temp;
                temp = temp.next;
                previous.next = temp;
                previous.next = temp.next;
                break;
            }

            temp = temp.next;
            count++;
        }
    }
}
