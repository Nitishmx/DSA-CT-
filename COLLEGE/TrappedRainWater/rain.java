package TrappedRainWater;

public class rain {
    public static int TrappedRainWater(int array[]) {
        int size = array.length;
        if (size <= 2) {
            System.out.println("water is not trapped");
        }
        // calculate letf max
        int leftMax[] = new int[array.length];

        leftMax[0] = array[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(array[i], leftMax[i - 1]);
            System.out.println(leftMax[i] + "max");
        }

        // right max calculate
        int rightMax[] = new int[size];
        rightMax[size - 1] = array[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            rightMax[i] = Math.max(array[i], rightMax[i + 1]);
            System.out.println(rightMax[i]);

        }

        // loop
        int trappedWater = 0;
        for (int i = 0; i < size; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - array[i];

        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int heigh[] = { 4, 2, 0, 6, 3, 2, 5 };
        int totalWater = TrappedRainWater(heigh);
        System.out.println("Total store wate : " + totalWater);
    }

}
