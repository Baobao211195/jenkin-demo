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
    	def mvnHome = tool name: 'Maven', type: 'maven'
        bat '${mvnHome}\\bin\\mvn package'
	    bat 'echo step1'
     }       
}
 
