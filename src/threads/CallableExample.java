package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample implements Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.sleep(200);
		return Thread.currentThread().getName();
	}
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(10);
		List<Future<String>> futureList = new ArrayList<>();
		
		Callable<String> task = new CallableExample();
		
		for(int i = 0;i<10;i++) {
			Future<String> future = exec.submit(task);
			futureList.add(future);
		}
		
		for(Future<String> future : futureList) {
			try {
				//if(future.isDone())
					System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}
}
