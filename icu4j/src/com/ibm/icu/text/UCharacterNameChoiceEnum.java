/**
*******************************************************************************
* Copyright (C) 1996-2000, International Business Machines Corporation and    *
* others. All Rights Reserved.                                                *
*******************************************************************************
*
* $Source: 
*     /usr/cvs/icu4j/icu4j/src/com/ibm/icu/text/UCharacterNameChoiceEnum.java $ 
* $Date: 2000/12/26 20:00:56 $ 
* $Revision: 1.1 $
*
*******************************************************************************
*/

package com.ibm.icu.text;

/**
* Internal class containing selector constants for the unicode character names.
* Constants representing the "modern" name of a Unicode character or the name 
* that was defined in Unicode version 1.0, before the Unicode standard 
* merged with ISO-10646.
* Arguments for <a href=UCharacterName.html>UCharacterName</a>
* @author Syn Wee Quek
* @since oct0600
*/

interface UCharacterNameChoiceEnum
{
  // public variables =============================================
  
  static final int U_UNICODE_CHAR_NAME = 0;
  static final int U_UNICODE_10_CHAR_NAME = U_UNICODE_CHAR_NAME + 1;
  static final int U_CHAR_NAME_CHOICE_COUNT = U_UNICODE_10_CHAR_NAME + 1;
}