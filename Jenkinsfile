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
        // Get the Maven tool.
        // ** NOTE: This 'M3' Maven tool must be configured
        echo 'Pulling...' + env.BRANCH_NAME
       def mvnHome = tool name: 'Maven', type: 'maven'
        if (isUnix()) {
            def targetVersion = getDevVersion()
            print 'target build version...'
            print targetVersion
            sh "'${mvnHome}/bin/mvn' -Dintegration-tests.skip=true -Dbuild.number=${targetVersion} clean package"
            def pom = readMavenPom file: 'pom.xml'
            // get the current development version 
            developmentArtifactVersion = "${pom.version}-${targetVersion}"
            print pom.version
            // execute the unit testing and collect the reports
            //junit '**//*target/surefire-reports/TEST-*.xml'
            //archive 'target*//*.jar'
        } else {
            bat(/"${mvnHome}\bin\mvn" -Dintegration-tests.skip=false clean package/)
            //def pom = readMavenPom file: 'pom.xml'
            //print pom.version
            //def pom = readMavenPom file: 'pom.xml'
            //print pom.version
            //junit '**//*target/surefire-reports/TEST-*.xml'
            //archive 'target*//*.jar'
    	}       
     }     
}
 
