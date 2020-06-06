# wikipoc
This repository contain java technology and framework related project. In other words proof of concept of the different framework.

# Hadoop HDFS Command Cheatsheet
## List Files
* List all the files/directories for the given hdfs destination path.
```
hdfs dfs -ls / 
```
* Directories are listed as plain files. In this case, this command will list, the details of hadoop folder.
```
hdfs dfs -ls -d /hadoop 
```
* Format file sizes in a human-readable fashion (eg 64.0m instead of 67108864).
```
hdfs dfs -ls -h /data 
```
* Recursively list all files in hadoop directory and all subdirectories in hadoop directory.
```
hdfs dfs -ls -R /hadoop 
```
* List all the files matching the pattern. In this case, it w
```
hdfs dfs -ls /hadoop/dat* 
```
