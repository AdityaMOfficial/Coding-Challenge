import java.util.Arrays;

public class JobSequencing {


    private static int maxProfit(Task[] tasks){
        int max_deadline = Integer.MIN_VALUE;
        int max_profit = 0;
        for(Task task : tasks)
            if(task.getDeadline() > max_deadline)
                max_deadline = task.getDeadline();


        Integer[] taskIds = new Integer[max_deadline];



        Arrays.asList(taskIds).stream().forEach(x -> System.out.print(x+" "));

        Arrays.sort(tasks);

        System.out.println();
        Arrays.asList(tasks).stream().forEach(System.out::println);
        for(Task task : tasks){
            int deadline = task.getDeadline();
            for(int i=deadline-1;i>=0;i--){
                if(taskIds[i]!=null)
                    continue;
                taskIds[i] = task.getTaskId();
                max_profit = max_profit + task.getProfit();
                break;
            }
        }
        System.out.println();
        Arrays.asList(taskIds).stream().forEach(x -> System.out.print(x+" "));

        return max_profit;
    }

    public static void main(String[] args) {
        int res = maxProfit(new Task[]{
                new Task(1,9,15),
                new Task(2,2,2),
                new Task(3,5,18),
                new Task(4,7,1),
                new Task(5,4,25),
                new Task(6,2,20),
                new Task(7,5,8),
                new Task(8,7,10),
                new Task(9,4,12),
                new Task(10,3,5)
        } );
        System.out.println();
        System.out.println(res);
    }
}
