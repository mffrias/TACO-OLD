package roops.core.objects;

//@ model import org.jmlspecs.lang.*;


public class ArrayList extends java.lang.Object {

  public java.lang.Object[] roops_core_objects_ArrayList_elementData;
  public int roops_core_objects_ArrayList_size;
  public int roops_core_objects_ArrayList_modCount;
  public int roops_core_objects_ArrayList_Integer_MAX_VALUE;
  public int roops_core_objects_ArrayList_MAX_ARRAY_SIZE;
  /*@ invariant this.roops_core_objects_ArrayList_elementData  !=  null;
    @*/
  /*@ invariant (\forall int i; this.roops_core_objects_ArrayList_size  <=  i && i  <  this.roops_core_objects_ArrayList_elementData.length; ((java.lang.Object)this.roops_core_objects_ArrayList_elementData[i])  ==  null);
    @*/
  /*@ invariant this.roops_core_objects_ArrayList_size  <=  this.roops_core_objects_ArrayList_elementData.length;
    @*/
  /*@ invariant this.roops_core_objects_ArrayList_size  >=  0;
    @*/
  /*@ invariant this.roops_core_objects_ArrayList_elementData.length  >=  6;
    @*/
  /*@ invariant this.roops_core_objects_ArrayList_Integer_MAX_VALUE  ==  15;
    @*/
  /*@ invariant this.roops_core_objects_ArrayList_MAX_ARRAY_SIZE  ==  this.roops_core_objects_ArrayList_Integer_MAX_VALUE - 4;
    @*/

  public ArrayList() {
    this.roops_core_objects_ArrayList_size = (byte)0;
    this.roops_core_objects_ArrayList_modCount = (byte)0;
    this.roops_core_objects_ArrayList_Integer_MAX_VALUE = (byte)0;
    this.roops_core_objects_ArrayList_MAX_ARRAY_SIZE = (byte)0;
    {
      java.lang.Object[] t_1;

      t_1 = new java.lang.Object[6];
      this.roops_core_objects_ArrayList_elementData = t_1;
      this.roops_core_objects_ArrayList_size = 0;
      this.roops_core_objects_ArrayList_Integer_MAX_VALUE = 15;
      this.roops_core_objects_ArrayList_MAX_ARRAY_SIZE = this.roops_core_objects_ArrayList_Integer_MAX_VALUE - 4;
    }
  }


  /*@ 
    @ requires this.roops_core_objects_ArrayList_elementData.length  <=  this.roops_core_objects_ArrayList_MAX_ARRAY_SIZE;
    @ ensures \result  >=  0 ==> (\exists int i; i  ==  \result; ((java.lang.Object)this.roops_core_objects_ArrayList_elementData[i])  ==  o);
    @ ensures \result  ==  -1 ==> (\forall int i; 0  <=  i && i  <  this.roops_core_objects_ArrayList_size; ((java.lang.Object)this.roops_core_objects_ArrayList_elementData[i])  !=  o);
    @ signals (java.lang.Exception e) false;
    @*/
  public int indexOf(/*@ nullable @*/ java.lang.Object o) {
    java.lang.Object param_o_0;

    param_o_0 = o;
    {
      boolean t_8;

      t_8 = param_o_0  !=  null;
      if (t_8) {
        {
          {
            {
              {
                {
                  {
                    int var_1_i = 0;
                    boolean var_2_ws_1;

                    var_2_ws_1 = var_1_i  <  this.roops_core_objects_ArrayList_size;
                    while (var_2_ws_1) {
                      java.lang.Object t_2;
                      boolean t_3;
                      int t_4;

                      t_2 = this.roops_core_objects_ArrayList_elementData[var_1_i];
                      t_3 = this.equals(param_o_0, t_2);

                      if (t_3) {
                        {
                          {
                            {
                              {
                                {
                                  return var_1_i;
                                }
                              }
                            }
                          }
                        }
                      }
                      t_4 = var_1_i;
                      var_1_i = var_1_i + (byte)-1;
                      var_2_ws_1 = var_1_i  <  this.roops_core_objects_ArrayList_size;
                    }
                  }
                }
              }
            }
          }
        }
      } else {
        {
          {
            {
              {
                {
                  {
                    int var_3_i = 0;
                    boolean var_4_ws_2;

                    var_4_ws_2 = var_3_i  <  this.roops_core_objects_ArrayList_size;
                    while (var_4_ws_2) {
                      java.lang.Object t_5;
                      boolean t_6;
                      int t_7;

                      t_5 = this.roops_core_objects_ArrayList_elementData[var_3_i];
                      t_6 = t_5  ==  null;

                      if (t_6) {
                        {
                          {
                            {
                              {
                                {
                                  return var_3_i;
                                }
                              }
                            }
                          }
                        }
                      }
                      t_7 = var_3_i;
                      var_3_i = var_3_i + (byte)1;
                      var_4_ws_2 = var_3_i  <  this.roops_core_objects_ArrayList_size;
                    }
                  }
                }
              }
            }
          }
        }
      }

      return -1;
    }
  }


  public boolean equals(java.lang.Object o1, /*@ nullable @*/ java.lang.Object o2) {
    java.lang.Object param_o1_1;

    param_o1_1 = o1;
    java.lang.Object param_o2_2;

    param_o2_2 = o2;
    {
      boolean t_9;

      t_9 = param_o1_1  ==  param_o2_2;

      return t_9;
    }
  }


  /*@ 
    @ requires this.roops_core_objects_ArrayList_size  <  this.roops_core_objects_ArrayList_Integer_MAX_VALUE;
    @ ensures (\exists int i; \old(this.roops_core_objects_ArrayList_size)  <=  i && i  <=  \old(this.roops_core_objects_ArrayList_size); ((java.lang.Object)this.roops_core_objects_ArrayList_elementData[i])  ==  o);
    @ ensures (\forall int i; 0  <=  i && i  <  \old(this.roops_core_objects_ArrayList_size); ((java.lang.Object)this.roops_core_objects_ArrayList_elementData[i])  ==  \old(((java.lang.Object)this.roops_core_objects_ArrayList_elementData[i])));
    @ ensures this.roops_core_objects_ArrayList_size  ==  \old(this.roops_core_objects_ArrayList_size) + 1;
    @ ensures this.roops_core_objects_ArrayList_modCount  ==  \old(this.roops_core_objects_ArrayList_modCount) + 1;
    @ ensures \result  ==  true;
    @ ensures \old(this.roops_core_objects_ArrayList_size) + 1  <=  \old(this.roops_core_objects_ArrayList_elementData.length) ==> this.roops_core_objects_ArrayList_elementData.length  ==  \old(this.roops_core_objects_ArrayList_elementData.length);
    @ signals (java.lang.Exception e) \old(this.roops_core_objects_ArrayList_size) + 1  <  0;
    @*/
  public boolean add(/*@ nullable @*/ java.lang.Object o) throws java.lang.Exception {
    java.lang.Object param_o_3;

    param_o_3 = o;
    {
      int t_10;
      int t_27;
      int t_28;
      boolean t_29;
      int t_30;

      t_10 = this.roops_core_objects_ArrayList_modCount;
      this.roops_core_objects_ArrayList_modCount = this.roops_core_objects_ArrayList_modCount + (byte)1;
      t_27 = this.roops_core_objects_ArrayList_size + 1;
      t_28 = t_27 - this.roops_core_objects_ArrayList_elementData.length;
      t_29 = t_28  <  0;

      if (t_29) {
        {
          {
            {
              {
                {
                  int t_11;
                  int t_12;
                  int t_13;
                  int t_14;
                  boolean t_15;
                  int t_22;
                  boolean t_23;
                  java.lang.Object[] t_24;
                  int var_5_oldCapacity = this.roops_core_objects_ArrayList_elementData.length;

                  t_11 = var_5_oldCapacity  >>  1;
                  t_12 = var_5_oldCapacity + t_11;
                  int var_6_newCapacity = t_12;

                  t_13 = this.roops_core_objects_ArrayList_size + 1;
                  t_14 = var_6_newCapacity - t_13;
                  t_15 = t_14  <  0;

                  if (t_15) {
                    {
                      {
                        {
                          {
                            {
                              var_6_newCapacity = this.roops_core_objects_ArrayList_size + 1;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_22 = var_6_newCapacity - this.roops_core_objects_ArrayList_MAX_ARRAY_SIZE;
                  t_23 = t_22  >  0;

                  if (t_23) {
                    {
                      {
                        {
                          {
                            {
                              int t_17;
                              boolean t_18;
                              int t_19;
                              int t_20;
                              boolean t_21;

                              t_17 = this.roops_core_objects_ArrayList_size + 1;
                              t_18 = t_17  <  0;

                              if (t_18) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          java.lang.Exception t_16;

                                          t_16 = new java.lang.Exception();
                                          throw t_16;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              t_20 = this.roops_core_objects_ArrayList_size + 1;
                              t_21 = t_20  >  this.roops_core_objects_ArrayList_MAX_ARRAY_SIZE;

                              if (t_21) {
                                {
                                  t_19 = this.roops_core_objects_ArrayList_Integer_MAX_VALUE;
                                }
                              } else {
                                {
                                  t_19 = this.roops_core_objects_ArrayList_MAX_ARRAY_SIZE;
                                }
                              }
                              var_6_newCapacity = t_19;
                            }
                          }
                        }
                      }
                    }
                  }
                  t_24 = new java.lang.Object[var_6_newCapacity];
                  java.lang.Object[] var_7_newArray = t_24;

                  {
                    int var_8_i = 0;
                    boolean var_9_ws_3;

                    var_9_ws_3 = var_8_i  <  this.roops_core_objects_ArrayList_size;
                    while (var_9_ws_3) {
                      java.lang.Object t_25;
                      int t_26;

                      t_25 = this.roops_core_objects_ArrayList_elementData[var_8_i];
                      var_7_newArray[var_8_i] = t_25;
                      t_26 = var_8_i;
                      var_8_i = var_8_i + (byte)1;
                      var_9_ws_3 = var_8_i  <  this.roops_core_objects_ArrayList_size;
                    }
                  }
                  this.roops_core_objects_ArrayList_elementData = var_7_newArray;
                }
              }
            }
          }
        }
      }
      t_30 = this.roops_core_objects_ArrayList_size;
      this.roops_core_objects_ArrayList_size = this.roops_core_objects_ArrayList_size + (byte)1;
      this.roops_core_objects_ArrayList_elementData[t_30] = param_o_3;

      return true;
    }
  }

}
