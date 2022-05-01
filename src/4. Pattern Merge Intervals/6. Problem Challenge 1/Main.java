package com.company;


import java.util.*;

public class Main {
    public static int findMinimumMeetingRooms(List<Meeting> meetings) {
        if (meetings == null || meetings.size() == 0)
            return 0;
        int minRooms = 0;
        Collections.sort(meetings, Comparator.comparingInt(meeting -> meeting.start));
        PriorityQueue<Meeting> heap = new PriorityQueue<>(meetings.size(), Comparator.comparingInt(meeting -> meeting.end));
        for (Meeting meeting : meetings){
            while (!heap.isEmpty() && meeting.start >= heap.peek().end) heap.poll();
            heap.add(meeting);
            minRooms = Math.max(minRooms,heap.size());
        }
        return minRooms;
    }
    public static void main(String[] args) {
        List<Meeting> input = new ArrayList<Meeting>() {
            {
                add(new Meeting(4, 5));
                add(new Meeting(2, 3));
                add(new Meeting(2, 4));
                add(new Meeting(3, 5));
            }
        };
        int result = findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);
        input = new ArrayList<Meeting>() {
            {
                add(new Meeting(1, 4));
                add(new Meeting(2, 5));
                add(new Meeting(7, 9));
            }
        };
        result = findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);
        input = new ArrayList<Meeting>() {
            {
                add(new Meeting(6, 7));
                add(new Meeting(2, 4));
                add(new Meeting(8, 12));
            }
        };
        result = findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);
        input = new ArrayList<Meeting>() {
            {
                add(new Meeting(1, 4));
                add(new Meeting(2, 3));
                add(new Meeting(3, 6));
            }
        };
        result = findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);
        input = new ArrayList<Meeting>() {
            {
                add(new Meeting(4, 5));
                add(new Meeting(2, 3));
                add(new Meeting(2, 4));
                add(new Meeting(3, 5));
            }
        };
        result = findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);
    }

}
class Meeting {
    int start;
    int end;
    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}


