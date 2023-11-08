package com.github.timtebeek.moneymaker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.zip.ZipEntry;

public class Slipper {
    public void unsafeUnzip(ZipEntry entry, File dir) throws Exception {
        String name = entry.getName();
        File file = new File(dir, name);
        FileOutputStream os = new FileOutputStream(file); // ZipSlip
        RandomAccessFile raf = new RandomAccessFile(file, "rw"); // ZipSlip
        FileWriter fw = new FileWriter(file); // ZipSlip
    }
}
