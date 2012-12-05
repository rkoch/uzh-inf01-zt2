/*
 * The MIT License (MIT)
 * Copyright © 2012 Remo Koch, http://rko.mit-license.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the “Software”), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.rko.uzh.zt2.model;

import java.util.ArrayList;
import java.util.List;

import io.rko.uzh.zt2.base.Fan;


public class Celebrity {

    private final String   mName;
    private final List<Fan> mFans;


    public Celebrity(String pName) {
        mName = pName;
        mFans = new ArrayList<Fan>();
    }


    public String getName() {
        return mName;
    }

    public List<Fan> getFans() {
        return mFans;
    }


    public void subscribe(Fan pFan) {
        mFans.add(pFan);
        System.out.println("Ich habe einen Fan mehr!");
    }

    public void unsubscribe(Fan pFan) {
        mFans.remove(pFan);
        System.out.println("Ich habe einen Fan weniger!");
    }

    public void printStatus(String pStatus) {
        for (Fan f : mFans) {
            f.receiveStatusUpdate(this, pStatus);
        }
    }

}
