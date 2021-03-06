/*

    PraFramework - A simple TCP-Networking framework for Java
    Copyright (C) 2017  Zortax

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

 */

package de.zortax.pra.network.event;//  Created by Leonard on 03.03.2017.

/**
 * should be implemented by all events that are cancellable
 */
public interface Cancellable {

    /**
     * @param cancelled true to cancel this event, false to uncancel it
     */
    void setCancelled(boolean cancelled);

    /**
     * @return true if this event was cancelled, false if not
     */
    boolean isCancelled();

}
