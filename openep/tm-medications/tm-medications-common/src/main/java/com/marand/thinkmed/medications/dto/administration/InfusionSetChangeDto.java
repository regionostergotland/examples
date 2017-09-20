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

package com.marand.thinkmed.medications.dto.administration;

import com.marand.thinkmed.medications.AdministrationTypeEnum;
import com.marand.thinkmed.medications.InfusionSetChangeEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Mitja Lapajne
 */

public class InfusionSetChangeDto extends AdministrationDto implements InfusionBagAdministration
{
  private InfusionSetChangeEnum infusionSetChangeEnum;

  private InfusionBagDto infusionBag;

  public InfusionSetChangeEnum getInfusionSetChangeEnum()
  {
    return infusionSetChangeEnum;
  }

  public void setInfusionSetChangeEnum(final InfusionSetChangeEnum infusionSetChangeEnum)
  {
    this.infusionSetChangeEnum = infusionSetChangeEnum;
  }

  @Override
  public InfusionBagDto getInfusionBag()
  {
    return infusionBag;
  }

  @Override
  public void setInfusionBag(final InfusionBagDto infusionBag)
  {
    this.infusionBag = infusionBag;
  }

  public InfusionSetChangeDto()
  {
    super(AdministrationTypeEnum.INFUSION_SET_CHANGE);
  }

  @Override
  protected void appendToString(final ToStringBuilder tsb)
  {
    super.appendToString(tsb);
    tsb.append("infusionSetChangeEnum", infusionSetChangeEnum).append("infusionBag", infusionBag);
  }
}
