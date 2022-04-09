package com.coffeepoweredcrew.nullobject;

public class NullStorageService extends StorageService{

	@Override
	public void save(Report report)
	{
		System.out.println("empty method was called-- doing jack shit");
	}
}
