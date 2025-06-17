class Main {
    public static void main(String[] args) {
        //0/1 Knapsack implementation
        int[] weights = {2,3,1,2};
        int[] profits = {12,12,3,9};
        int bagWeight = 3;
        System.out.println(napsack(bagWeight, 0, weights, profits));
    }
    public static long napsack(int bagWeight,int selectedElement, int[] weights, int[] profits) {
        if(selectedElement >= weights.length || bagWeight==0 ){
        return 0;
    }
    long pick = 0;
    if(bagWeight >= weights[selectedElement]){
        pick = profits[selectedElement] + napsack(bagWeight - weights[selectedElement], selectedElement+1,weights,profits);
    }
    long notpick = napsack(bagWeight,selectedElement+1,weights,profits);
    return Math.max(pick,notpick);
    }
}