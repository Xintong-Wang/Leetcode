class MyCalendar {
    private TreeMap<Integer, Integer> booked;

    public MyCalendar() {
        booked = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        if(booked.floorKey(start) != null && booked.get(booked.floorKey(start)) > start)
            return false;
        if(booked.ceilingKey(start) != null && booked.ceilingKey(start) < end)
            return false;
        booked.put(start, end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
