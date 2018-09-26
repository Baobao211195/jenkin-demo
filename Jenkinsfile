node {
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
    	// def MAVEN_HOME = tool name: 'Maven', type: 'maven'
        // bat "${MAVEN_HOME}/bin/mvn clean install"
         steps {
             bat 'echo step1'
             bat 'echo step2'
             bat '''
                echo 'Multiline'
                echo 'Example'
             '''
             echo 'not using shell'
          } 
     }       
}
 
