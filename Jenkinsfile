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
    	echo "Display : ${mvnHome}"
    	bat 'echo step1'
        bat '${mvnHome}\\bin\\mvn package'
     }       
}
 
