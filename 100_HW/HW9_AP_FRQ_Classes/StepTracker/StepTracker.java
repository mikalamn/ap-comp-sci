public class StepTracker{
    public int minSteps;
    public int totalSteps;
    public int totalDays;
    public int activeDays;
    
    public StepTracker(int minSteps){
        this.minSteps = minSteps;
        this.totalSteps = 0;
        this.totalDays = 0;
        this.activeDays = 0;
    }
    public void addDailySteps(int steps){
        totalSteps += steps;
        totalDays ++;
        
        if (steps >= minSteps){
            activeDays++;
        }
    }
    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        if(totalDays==0){
            return 0.0;
        }
        return(double)totalSteps/totalDays;
    }
}