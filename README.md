# FastToast
Fast Toast is my first android library

Step 1: Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2: Add the dependency

	dependencies {
	        implementation 'com.github.ganpatmalekar:FastToast:Tag(version number)'
	}

Step 3: How to use?

// First add dependancy into your project then use this:

	FastToast.create(this, "Fast Toast Library", 0);
