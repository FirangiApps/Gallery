/*
 * Copyright (C) 2011-2014 The Android Open Source Project
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

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: vendor/tinno/tinnoapps/MyosGallery2/src/com/android/gallery3d/filtershow/filters/saturation.rs
 */

package com.android.gallery3d.filtershow.filters;

import android.content.res.Resources;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.Matrix3f;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.Script;
import android.renderscript.ScriptC;
import android.renderscript.Type;

/**
 * @hide
 */
public class ScriptC_saturation extends ScriptC {
    private static final String __rs_resource_name = "saturation";
    private final static int mExportVarIdx_colorMatrix_min = 0;
    private final static int mExportVarIdx_colorMatrix_max = 1;
    private final static int mExportVarIdx_mNumberOfLines = 2;
    private final static int mExportVarIdx_saturation = 3;
    private final static int mExportVarIdx_sat = 4;
    private final static int mExportVarIdx_satLut = 5;
    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_selectiveAdjust = 1;
    private final static int mExportFuncIdx_setupGradParams = 0;
    private Element __F32;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_I32;
    private Matrix3f mExportVar_colorMatrix_min;
    private Matrix3f mExportVar_colorMatrix_max;
    private int mExportVar_mNumberOfLines;
    private int[] mExportVar_saturation;
    private float[] mExportVar_sat;
    private float[] mExportVar_satLut;

    // Constructor
    public ScriptC_saturation(RenderScript rs) {
        this(rs,
                rs.getApplicationContext().getResources(),
                rs.getApplicationContext().getResources().getIdentifier(
                        __rs_resource_name, "raw",
                        rs.getApplicationContext().getPackageName()));
    }

    public ScriptC_saturation(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __I32 = Element.I32(rs);
        __F32 = Element.F32(rs);
        __U8_4 = Element.U8_4(rs);
    }

    public Matrix3f get_colorMatrix_min() {
        return mExportVar_colorMatrix_min;
    }

    public synchronized void set_colorMatrix_min(Matrix3f v) {
        mExportVar_colorMatrix_min = v;
        FieldPacker fp = new FieldPacker(36);
        fp.addMatrix(v);
        setVar(mExportVarIdx_colorMatrix_min, fp);
    }

    public Script.FieldID getFieldID_colorMatrix_min() {
        return createFieldID(mExportVarIdx_colorMatrix_min, null);
    }

    public Matrix3f get_colorMatrix_max() {
        return mExportVar_colorMatrix_max;
    }

    public synchronized void set_colorMatrix_max(Matrix3f v) {
        mExportVar_colorMatrix_max = v;
        FieldPacker fp = new FieldPacker(36);
        fp.addMatrix(v);
        setVar(mExportVarIdx_colorMatrix_max, fp);
    }

    public Script.FieldID getFieldID_colorMatrix_max() {
        return createFieldID(mExportVarIdx_colorMatrix_max, null);
    }

    public int get_mNumberOfLines() {
        return mExportVar_mNumberOfLines;
    }

    public synchronized void set_mNumberOfLines(int v) {
        setVar(mExportVarIdx_mNumberOfLines, v);
        mExportVar_mNumberOfLines = v;
    }

    public Script.FieldID getFieldID_mNumberOfLines() {
        return createFieldID(mExportVarIdx_mNumberOfLines, null);
    }

    public int[] get_saturation() {
        return mExportVar_saturation;
    }

    public synchronized void set_saturation(int[] v) {
        mExportVar_saturation = v;
        FieldPacker fp = new FieldPacker(28);
        for (int ct1 = 0; ct1 < 7; ct1++) {
            fp.addI32(v[ct1]);
        }

        int[] __dimArr = new int[1];
        __dimArr[0] = 7;
        setVar(mExportVarIdx_saturation, fp, __I32, __dimArr);
    }

    public Script.FieldID getFieldID_saturation() {
        return createFieldID(mExportVarIdx_saturation, null);
    }

    public float[] get_sat() {
        return mExportVar_sat;
    }

    public synchronized void set_sat(float[] v) {
        mExportVar_sat = v;
        FieldPacker fp = new FieldPacker(28);
        for (int ct1 = 0; ct1 < 7; ct1++) {
            fp.addF32(v[ct1]);
        }

        int[] __dimArr = new int[1];
        __dimArr[0] = 7;
        setVar(mExportVarIdx_sat, fp, __F32, __dimArr);
    }

    public Script.FieldID getFieldID_sat() {
        return createFieldID(mExportVarIdx_sat, null);
    }

    public float[] get_satLut() {
        return mExportVar_satLut;
    }

    public synchronized void set_satLut(float[] v) {
        mExportVar_satLut = v;
        FieldPacker fp = new FieldPacker(16384);
        for (int ct1 = 0; ct1 < 4096; ct1++) {
            fp.addF32(v[ct1]);
        }

        int[] __dimArr = new int[1];
        __dimArr[0] = 4096;
        setVar(mExportVarIdx_satLut, fp, __F32, __dimArr);
    }

    public Script.FieldID getFieldID_satLut() {
        return createFieldID(mExportVarIdx_satLut, null);
    }

    public Script.KernelID getKernelID_selectiveAdjust() {
        return createKernelID(mExportForEachIdx_selectiveAdjust, 59, null, null);
    }

    public void forEach_selectiveAdjust(Allocation ain, Allocation aout) {
        forEach_selectiveAdjust(ain, aout, null);
    }

    public void forEach_selectiveAdjust(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
                (t0.getX() != t1.getX()) ||
                (t0.getY() != t1.getY()) ||
                (t0.getZ() != t1.getZ()) ||
                (t0.hasFaces() != t1.hasFaces()) ||
                (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_selectiveAdjust, ain, aout, null, sc);
    }

    public void invoke_setupGradParams() {
        invoke(mExportFuncIdx_setupGradParams);
    }

}

