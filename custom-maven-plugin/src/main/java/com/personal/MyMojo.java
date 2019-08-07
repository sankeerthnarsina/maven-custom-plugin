package com.personal;

import java.util.List;

import org.apache.maven.model.Resource;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "myHelloPlugin", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class MyMojo extends AbstractMojo {
	    
    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    private MavenProject project;

    @Parameter(defaultValue = "${project.resources}", required = true, readonly = true)
    private List<Resource> resources;

    @Parameter(required = true)
    private String packageName;
    
    public void execute()
        throws MojoExecutionException, MojoFailureException
    {

        System.out.println("*********************************************************");
        System.out.println("************* MVP JAVA MOJO FXML PLUGIN *****************");
        System.out.println("*********************************************************");
        
        System.out.println("artifact ID:"+ project.getArtifactId());
        System.out.println("project version"+ project.getVersion());
        System.out.println("Package name : "+ packageName);
        getLog().info(String.format("artifact ID:"+ project.getArtifactId()));
        getLog().info(String.format("project version"+ project.getVersion()));
        getLog().info(String.format("Package name : "+ packageName));

//        resources.get(0).getDirectory().getBytes(Charset.defaultCharset());
            
    }
}
