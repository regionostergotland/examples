/*
 * Copyright (c) 2010-2014 Marand d.o.o. (www.marand.com)
 *
 * This file is part of Think!Med Clinical Medication Management.
 *
 * Think!Med Clinical Medication Management is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Think!Med Clinical Medication Management is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Think!Med Clinical Medication Management.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.marand.thinkmed.medications;

import org.openehr.jaxb.rm.DvText;

/**
 * @author Mitja Lapajne
 */
public enum MedicationDeliveryMethodEnum
{
  RECURRING_CONTINUOUS_INFUSION,
  CONTINUOUS_INFUSION;

  public static boolean isContinuousInfusion(final DvText deliveryMethod)
  {
    return RECURRING_CONTINUOUS_INFUSION.isEqualTo(deliveryMethod) || CONTINUOUS_INFUSION.isEqualTo(deliveryMethod);
  }

  public static String getFullString(final MedicationDeliveryMethodEnum timingEnum)
  {
    return MedicationDeliveryMethodEnum.class.getSimpleName() + '.' + timingEnum.name();
  }

  public boolean isEqualTo(final DvText text)
  {
    return text != null && getFullString(this).equals(text.getValue());
  }
}