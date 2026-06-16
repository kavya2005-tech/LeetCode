class RideSharingSystem {
    Queue<Integer> rider;
    Set<Integer> cancel;
    Queue<Integer> driver;

    public RideSharingSystem() {
        rider = new LinkedList<>();
        cancel = new HashSet<>();
        driver = new LinkedList<>();
    }

    public void addRider(int riderId) {
        rider.offer(riderId);
        cancel.add(riderId);
    }

    public void addDriver(int driverId) {
        driver.offer(driverId);
    }

    public int[] matchDriverWithRider() {
        while(!rider.isEmpty() && !cancel.contains(rider.peek())){
             rider.poll();
        }
        if(rider.isEmpty() || driver.isEmpty()){
            return new int[] {-1,-1};
        }
        int ri = rider.poll();
        int di = driver.poll();
        return new int[]{di,ri};
    }

    public void cancelRider(int riderId) {
        cancel.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */