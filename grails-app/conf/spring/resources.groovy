// Place your Spring DSL code here
beans = {

	xmlns task: "http://www.springframework.org/schema/task"

	task.'scheduled-tasks' {
		
		//using cron expression
		task.scheduled(ref: 'executorService', method: 'exec', cron: '* * * * * ?')
		
		//using fixedRate (time between executions start time)
		//task.scheduled(ref: 'executorService', method: 'exec', 'fixed-rate': 5000L)

		//using fixedDelay (time between executions finish time)
		//task.scheduled(ref: 'executorService', method: 'exec', 'fixed-delay': 5000L)
	}
	
}
