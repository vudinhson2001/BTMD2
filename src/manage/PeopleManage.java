package manage;

import danhba.People;

import java.util.ArrayList;
import java.util.List;

public class PeopleManage implements Manage<People> {
     ArrayList<People> peopleArrayList = new ArrayList<>();

    public ArrayList<People> getPeopleArray() {
        return peopleArrayList;
    }

    @Override
    public void add(People people) {
        peopleArrayList.add(people);
    }

    @Override
    public void display() {
        for (int i = 0; i < peopleArrayList.size(); i++) {
            System.out.println(peopleArrayList.get(i));
        }
    }

    @Override
    public void delete(String name) {
        for (int i = 0; i < peopleArrayList.size(); i++) {
            if (peopleArrayList.get(i).getName().equals(name)) {
                peopleArrayList.remove(peopleArrayList.get(i));
                break;
            }
        }
    }

    @Override
    public void edit(String name, People people) {
        int index0f = search(name);
        if (index0f == -1) {
            System.err.println("khong co ten nay!!!");
        } else {
            peopleArrayList.set(index0f, people);
        }
    }

    @Override
    public int search(String name) {
        for (int i = 0; i < peopleArrayList.size(); i++) {
            if (peopleArrayList.get(i).getName().equals(name)) {
                System.out.println(peopleArrayList.get(i));
                return i;
            }
        }
        return -1;
    }
}
