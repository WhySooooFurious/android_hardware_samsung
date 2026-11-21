/*
 * Copyright (C) 2012 The CyanogenMod Project
 *               2017-2026 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lineageos.settings.device;

import java.io.File;
import java.io.FileWriter;

/**
 * Local replacement for org.lineageos.internal.util.FileUtils, which is
 * not available in this tree.
 */
public class SysfsUtils {

    public static boolean isFileWritable(String file) {
        File f = new File(file);
        return f.exists() && f.canWrite();
    }

    public static boolean writeLine(String file, String contents) {
        try {
            File f = new File(file);
            if (f.exists()) {
                FileWriter writer = new FileWriter(f);
                writer.write(contents);
                writer.close();
                return true;
            }
        } catch (Exception e) {
            // ignore
        }
        return false;
    }
}
