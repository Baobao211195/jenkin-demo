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
    stage ('Complie-Package') {
    	def MVN_HOME = tool name: 'Maven', type: 'maven'
    	call "${MVN_HOME}/bin/mvn clean install -U -DskipTests"
    }
}
 
