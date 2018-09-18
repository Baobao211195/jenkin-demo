node {
	tools {
        maven 'Maven'
        jdk 'Java8'
    }
	stage('Checkout') {
       checkout(
       		[$class: 'GitSCM',
       		 branches: [[name: '*/master']],
       		 browser: [
       		 	$class: 'GithubWeb',
       		 	repoUrl: 'https://github.com/phamvanoanh'
       		 ],
       		 doGenerateSubmoduleConfigurations: false,
       		 extensions: [
       		 	[
       		 		$class: 'CleanBeforeCheckout'
       		 	]
       		 ],
       		 submoduleCfg: [],
       		 userRemoteConfigs: [
       		 	[
       		 		credentialsId: 'git',
       		 		url: 'https://github.com/phamvanoanh/jenkin-demo.git']
       		 	]
       		 ]
       )
    }
    stage ('Build') {
    	 sh '''
	            echo "PATH = ${PATH}"
	            echo "M2_HOME = ${M2_HOME}"
        	'''
    	 steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
            
     }       
}
 
