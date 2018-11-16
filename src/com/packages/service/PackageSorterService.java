package com.packages.service;

import com.packages.model.Package;
import com.packages.queue.PackageQueue;

import java.util.List;

public interface PackageSorterService {
    public void loadPackageData();
    public List<Package> sortBySendDate();
    public List<Package> sortBySize();
    public List<Package> sortByIsPrime();
    public PackageQueue fragilePackageQueue();
    public PackageQueue expeditedPackageQueue();
}
