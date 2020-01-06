class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int order = 0, total = 0;
        for(int i = 0; i < distance.length; i++){
            if(i >= start && i < destination || i >= destination && i < start)
                order += distance[i];
            total += distance[i];
        }
        return order > total - order ? total - order : order;
    }
}
