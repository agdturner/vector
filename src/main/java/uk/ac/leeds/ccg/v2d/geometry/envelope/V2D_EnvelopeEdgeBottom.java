/*
 * Copyright 2020 Andy Turner, University of Leeds.
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
package uk.ac.leeds.ccg.v2d.geometry.envelope;

import uk.ac.leeds.ccg.v2d.geometry.V2D_Point;

/**
 * For the bottom edge of an envelope. For the two points that define the line
 * segment, {@link #p} is the bottom-left point (bl) and {@link q} is the
 * bottom-right point (br). {@code bl.x} should be less than or equal to
 * {@code br.x}: {@code bl.y} should equal {@code br.y}. No checking of these 
 * conditions is done for efficiency
 * reasons.
 *
 * @author Andy Turner
 * @version 1.0
 */
public class V2D_EnvelopeEdgeBottom extends V2D_EnvelopeEdge {

    private static final long serialVersionUID = 1L;

    /**
     * @param bl The point in the bottom-left of an envelope.
     * @param br The point in the bottom-right of an envelope.
     */
    public V2D_EnvelopeEdgeBottom(V2D_Point bl, V2D_Point br) {
        super(bl, br);
    }

    /**
     * @param e A V2D_Envelope.
     */
    public V2D_EnvelopeEdgeBottom(V2D_Envelope e) {
        super(new V2D_Point(e.getxMin(), e.getyMin()), new V2D_Point(e.getxMax(), e.getyMin()));
    }

    public V2D_Point getBl() {
        return p;
    }

    public V2D_Point getBr() {
        return q;
    }

}
