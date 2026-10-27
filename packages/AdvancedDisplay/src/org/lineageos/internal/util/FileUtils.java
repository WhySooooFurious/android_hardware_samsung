//
// Copyright (C) 2026 The LineageOS Project
//
// SPDX-License-Identifier: Apache-2.0
//

package org.lineageos.internal.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Stub of the LineageOS platform library class, which the A17 base
 * (PixelOS) no longer ships.
 */
public class FileUtils {
    public static boolean isFileWritable(String path) {
        File file = new File(path);
        return file.exists() && file.canWrite();
    }

    public static boolean writeLine(String path, String line) {
        try (FileWriter writer = new FileWriter(path, false)) {
            writer.write(line);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
