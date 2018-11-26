How to use algae.jar:

1. Put algae.jar in WEB-INF/lib, then algae will become your default theme if there is no others theme.

2. Now you can also dynamically switch between different themes by cookie or library property
	* Use library-property
	  	<!-- in WEB-INF/zk.xml -->
		<library-property>
		    <name>org.zkoss.theme.preferred</name>
		    <value>algae</value>
		</library-property>
		
	* Use cookie to switch theme, add a cookie
		zktheme=algae
	
It does not require a server restart, but user has to refresh the browser.
