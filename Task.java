public class Task implements Comparable<Task> {
    private int taskId;
    private int deadline;
    private int profit;

    public Task(int taskId, int deadline, int profit) {
        this.taskId = taskId;
        this.deadline = deadline;
        this.profit = profit;
    }


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    @Override
    public int compareTo(Task other) {
        return other.getProfit() - this.profit;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", deadline=" + deadline +
                ", profit=" + profit +
                '}';
    }
}
