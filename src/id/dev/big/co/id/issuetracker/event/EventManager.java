/***********************************************************************
 * This file is part of iDempiere ERP Open Source                      *
 * http://www.idempiere.org                                            *
 *                                                                     *
 * Copyright (C) Contributors                                          *
 *                                                                     *
 * This program is free software; you can redistribute it and/or       *
 * modify it under the terms of the GNU General Public License         *
 * as published by the Free Software Foundation; either version 2      *
 * of the License, or (at your option) any later version.              *
 *                                                                     *
 * This program is distributed in the hope that it will be useful,     *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of      *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the        *
 * GNU General Public License for more details.                        *
 *                                                                     *
 * You should have received a copy of the GNU General Public License   *
 * along with this program; if not, write to the Free Software         *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,          *
 * MA 02110-1301, USA.                                                 *
 *                                                                     *
 * Contributors:                                                       *
 * - hengsin                         								   *
 **********************************************************************/
package id.dev.big.co.id.issuetracker.event;

import org.adempiere.base.AnnotationBasedEventManager;
import org.osgi.service.component.annotations.Component;

/**
 * Default implementation of {@link AnnotationBasedEventManager} that would scan the org.adempiere.base.event.delegate package.
 */
@Component(immediate = true, service = {EventManager.class})
public class EventManager extends AnnotationBasedEventManager {

	/**
	 * default constructor
	 */
	public EventManager() {
	}

	@Override
	public String[] getPackages() {
		return new String[] {"id.dev.big.co.id.issuetracker.event"};
	}

}
