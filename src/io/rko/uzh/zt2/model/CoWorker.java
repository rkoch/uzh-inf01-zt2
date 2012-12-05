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

import java.util.List;
import java.util.Random;

import io.rko.uzh.zt2.base.Fan;


public class CoWorker
        extends Friend {

    public CoWorker(String pName, String pNumber) {
        super(pName, pNumber);
    }


    @Override
    public void receiveStatusUpdate(Celebrity pCelebrity, String pStatus) {
        super.receiveStatusUpdate(pCelebrity, pStatus);
        List<Fan> fans = pCelebrity.getFans();

        if (fans.size() > 1) {
            Random rand = new Random();
            for (int i = 0; i < 2; i++) { // Execute this two times
                int idx = rand.nextInt(fans.size());
                Fan f = fans.get(idx); // Find random fan
                if (this != f) {
                    f.receiveStatusUpdate(pCelebrity, pStatus); // Share update
                }
            }
        }
    }

}
