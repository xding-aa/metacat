/*
 * Copyright 2016 Netflix, Inc.
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

/* PartitionParserTokenManager.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. PartitionParserTokenManager.java */
package com.netflix.metacat.common.partition.parser;

/** Token Manager. */
@SuppressWarnings("unused")public class PartitionParserTokenManager implements PartitionParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x180L) != 0L)
            return 5;
         if ((active0 & 0x1f00000L) != 0L)
            return 30;
         return -1;
      case 1:
         if ((active0 & 0xf00000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 1;
            return 30;
         }
         if ((active0 & 0x1000000L) != 0L)
            return 30;
         return -1;
      case 2:
         if ((active0 & 0x100000L) != 0L)
            return 30;
         if ((active0 & 0xe00000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 2;
            return 30;
         }
         return -1;
      case 3:
         if ((active0 & 0xa00000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 3;
            return 30;
         }
         if ((active0 & 0x400000L) != 0L)
            return 30;
         return -1;
      case 4:
         if ((active0 & 0xa00000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 4;
            return 30;
         }
         return -1;
      case 5:
         if ((active0 & 0xa00000L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 5;
            return 30;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 27);
      case 39:
         return jjStopAtPos(0, 28);
      case 40:
         return jjStopAtPos(0, 9);
      case 41:
         return jjStopAtPos(0, 10);
      case 44:
         return jjStopAtPos(0, 11);
      case 60:
         jjmatchedKind = 8;
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 62:
         jjmatchedKind = 6;
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         else if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 110:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(1, 24, 30);
         break;
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 107:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 116:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 20, 30);
         return jjMoveStringLiteralDfa3_0(active0, 0xa00000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 101:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 30);
         break;
      case 119:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 104:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0xa00000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(6, 23, 30);
         break;
      case 115:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(6, 21, 30);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 47;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 12)
                        kind = 12;
                     { jjCheckNAddStates(0, 6); }
                  }
                  else if (curChar == 45)
                     { jjCheckNAddStates(7, 9); }
                  else if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 19;
                  else if (curChar == 46)
                     { jjCheckNAddTwoStates(8, 15); }
                  else if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 5;
                  else if (curChar == 33)
                     jjstateSet[jjnewStateCnt++] = 3;
                  else if (curChar == 61)
                  {
                     if (kind > 3)
                        kind = 3;
                  }
                  if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 61 && kind > 3)
                     kind = 3;
                  break;
               case 2:
                  if (curChar == 61 && kind > 3)
                     kind = 3;
                  break;
               case 3:
                  if (curChar == 61 && kind > 4)
                     kind = 4;
                  break;
               case 4:
                  if (curChar == 33)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if (curChar == 62)
                     kind = 4;
                  break;
               case 6:
                  if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 46)
                     { jjCheckNAddTwoStates(8, 15); }
                  break;
               case 8:
                  if (curChar == 45)
                     { jjCheckNAdd(9); }
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAddTwoStates(9, 10); }
                  break;
               case 11:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(12, 14); }
                  break;
               case 12:
                  if (curChar == 45)
                     { jjCheckNAdd(13); }
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAdd(13); }
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAdd(14); }
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAddTwoStates(15, 10); }
                  break;
               case 19:
                  if (curChar == 38 && kind > 18)
                     kind = 18;
                  break;
               case 20:
                  if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 31:
                  if (curChar == 45)
                     { jjCheckNAddStates(7, 9); }
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  { jjCheckNAdd(32); }
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(33, 34); }
                  break;
               case 35:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(36, 38); }
                  break;
               case 36:
                  if (curChar == 45)
                     { jjCheckNAdd(37); }
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAdd(37); }
                  break;
               case 38:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAdd(38); }
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(39, 40); }
                  break;
               case 40:
                  if (curChar != 46)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAddTwoStates(41, 10); }
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAddTwoStates(41, 10); }
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  { jjCheckNAddStates(0, 6); }
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  { jjCheckNAdd(43); }
                  break;
               case 44:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(44, 34); }
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(45, 40); }
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(46, 7); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe00000000L & l) != 0L)
                     { jjCheckNAdd(30); }
                  else if ((0x7fffffeL & l) != 0L)
                     { jjCheckNAdd(28); }
                  else if (curChar == 95)
                     { jjCheckNAdd(26); }
                  else if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 23;
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 21;
                  else if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 10:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(10, 12); }
                  break;
               case 16:
                  if (curChar == 100 && kind > 18)
                     kind = 18;
                  break;
               case 17:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 21:
                  if (curChar == 114 && kind > 19)
                     kind = 19;
                  break;
               case 22:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 124 && kind > 19)
                     kind = 19;
                  break;
               case 24:
                  if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 95)
                     { jjCheckNAdd(26); }
                  break;
               case 26:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAdd(26); }
                  break;
               case 27:
                  if ((0x7fffffeL & l) != 0L)
                     { jjCheckNAdd(28); }
                  break;
               case 28:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAdd(28); }
                  break;
               case 29:
                  if ((0x7fffffe00000000L & l) != 0L)
                     { jjCheckNAdd(30); }
                  break;
               case 30:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAdd(30); }
                  break;
               case 34:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(13, 15); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 47 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_2()
{
   return jjMoveNfa_2(0, 0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_2(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 2;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffff7fffffffffL & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                  }
                  else if (curChar == 39)
                  {
                     if (kind > 31)
                        kind = 31;
                  }
                  break;
               case 1:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     kind = 32;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  kind = 32;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 32)
                     kind = 32;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 2 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 2;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfffffffbffffffffL & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                  }
                  else if (curChar == 34)
                  {
                     if (kind > 29)
                        kind = 29;
                  }
                  break;
               case 1:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     kind = 30;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  kind = 30;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 30)
                     kind = 30;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 2 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   43, 44, 34, 45, 40, 46, 7, 32, 33, 39, 11, 12, 14, 35, 36, 38, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\76\75", "\76", "\74\75", "\74", "\50", "\51", 
"\54", null, null, null, null, null, null, null, null, "\156\157\164", 
"\155\141\164\143\150\145\163", "\154\151\153\145", "\142\145\164\167\145\145\156", "\151\156", null, null, 
"\42", "\47", null, null, null, null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100000200L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       break;
     case 2:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_2();
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public PartitionParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public PartitionParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream)
  {
	
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 47; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit( SimpleCharStream stream, int lexState)
  {
  
    ReInit( stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "STRING_STATE",
   "SSTRING_STATE",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, 1, 2, 0, -1, 0, -1, 
};
static final long[] jjtoToken = {
   0x1fbfc5ff9L, 
};
static final long[] jjtoSkip = {
   0x6L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[47];
    private final int[] jjstateSet = new int[2 * 47];

    
    protected int curChar;
}
