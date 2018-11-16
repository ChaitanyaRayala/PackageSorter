package com.packages.service;

import com.packages.model.Package;
import com.packages.queue.PackageQueue;
import com.packages.resource.DataLoaderService;
import com.packages.resource.DataLoaderServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class PackageSorterServiceImpl implements PackageSorterService{

    private static List<Package> packageList = new ArrayList<Package>();

    @Override
    public void loadPackageData() {
        DataLoaderService dataLoader = new DataLoaderServiceImpl();
        List<String> dataInStringFrmt = dataLoader.getData();

        for(String dataRow:dataInStringFrmt){
            Package packageInstance = new Package();
            String[] dataRowDelByComma = dataRow.split(",");
            String[] dataRowSize = dataRowDelByComma[0].split(":");
            
        }
    }

    @Override
    public List<Package> sortBySendDate() {
        return null;
    }

    @Override
    public List<Package> sortBySize() {
        return null;
    }

    @Override
    public List<Package> sortByIsPrime() {
        return null;
    }

    @Override
    public PackageQueue fragilePackageQueue() {
        return null;
    }

    @Override
    public PackageQueue expeditedPackageQueue() {
        return null;
    }
}
