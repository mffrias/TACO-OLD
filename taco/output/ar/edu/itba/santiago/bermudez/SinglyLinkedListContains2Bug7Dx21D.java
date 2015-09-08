package ar.edu.itba.santiago.bermudez;

//@ model import org.jmlspecs.lang.*;

/** SinglyLinkedListInsertBackBug9x12Ix8I
*/
public class SinglyLinkedListContains2Bug7Dx21D extends java.lang.Object {

  public /*@ nullable @*/ roops.core.objects.SinglyLinkedListNode ar_edu_itba_santiago_bermudez_SinglyLinkedListContains2Bug7Dx21D_header;
  /*@ invariant (\forall roops.core.objects.SinglyLinkedListNode n; \reach(this.ar_edu_itba_santiago_bermudez_SinglyLinkedListContains2Bug7Dx21D_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); \reach(n.roops_core_objects_SinglyLinkedListNode_next, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n)))  ==  false);
    @*/

  public SinglyLinkedListContains2Bug7Dx21D() {
    this.ar_edu_itba_santiago_bermudez_SinglyLinkedListContains2Bug7Dx21D_header = ((roops.core.objects.SinglyLinkedListNode)(null));
    {
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\exists roops.core.objects.SinglyLinkedListNode n; \reach(this.ar_edu_itba_santiago_bermudez_SinglyLinkedListContains2Bug7Dx21D_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); n.roops_core_objects_SinglyLinkedListNode_value  ==  valueParam) ==> (\result  ==  true);
    @ ensures (\result  ==  true) ==> (\exists roops.core.objects.SinglyLinkedListNode n; \reach(this.ar_edu_itba_santiago_bermudez_SinglyLinkedListContains2Bug7Dx21D_header, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).has(((java.lang.Object)(n))); n.roops_core_objects_SinglyLinkedListNode_value  ==  valueParam);
    @ signals (java.lang.RuntimeException e) false;
    @*/
  public boolean contains(/*@ nullable @*/ java.lang.Object valueParam) {
    java.lang.Object param_valueParam_0;

    param_valueParam_0 = valueParam;
    {
      boolean t_1;
      boolean t_2;
      boolean t_3;
      roops.core.objects.SinglyLinkedListNode var_1_current;
      boolean var_2_result;

      var_1_current = this.ar_edu_itba_santiago_bermudez_SinglyLinkedListContains2Bug7Dx21D_header;
      var_2_result = false;
      boolean var_3_ws_1;

      t_2 = var_2_result  ==  false;

      if (t_2) {
        {
          {
            t_3 = var_1_current  !=  null;
            if (t_3) {
              {
                t_1 = true;
              }
            } else {
              {
                t_1 = false;
              }
            }
          }
        }
      } else {
        {
          t_1 = false;
        }
      }
      var_3_ws_1 = t_1;

      /*@ decreasing \reach(var_1_current, roops.core.objects.SinglyLinkedListNode, roops_core_objects_SinglyLinkedListNode_next).int_size();
        @*/
      while (var_3_ws_1) {
        boolean t_6;
        boolean t_7;
        java.lang.Boolean t_8;
        boolean t_9;
        boolean t_10;
        boolean t_11;
        boolean t_12;
        boolean t_13;
        boolean var_4_equalVal;

        t_7 = valueParam  ==  null;
        t_8 = new java.lang.Boolean(false);

        if (t_7) {
          {
            {
              t_9 = var_1_current.roops_core_objects_SinglyLinkedListNode_value  ==  t_8;
              if (t_9) {
                {
                  t_6 = true;
                }
              } else {
                {
                  t_6 = false;
                }
              }
            }
          }
        } else {
          {
            t_6 = false;
          }
        }

        if (t_6) {
          {
            {
              {
                {
                  {
                    var_4_equalVal = true;
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
                    boolean t_5;

                    t_5 = valueParam  !=  null;
                    if (t_5) {
                      {
                        {
                          {
                            {
                              {
                                boolean t_4;

                                t_4 = valueParam  ==  var_1_current.roops_core_objects_SinglyLinkedListNode_value;
                                if (t_4) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            var_4_equalVal = true;
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
                                            var_4_equalVal = false;
                                          }
                                        }
                                      }
                                    }
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
                                var_4_equalVal = false;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        t_10 = var_4_equalVal  ==  true;

        if (t_10) {
          {
            {
              {
                {
                  {
                    var_2_result = var_4_equalVal;
                  }
                }
              }
            }
          }
        }
        var_1_current = var_1_current.roops_core_objects_SinglyLinkedListNode_next;
        t_12 = var_2_result  ==  false;

        if (t_12) {
          {
            {
              t_13 = var_1_current  !=  null;
              if (t_13) {
                {
                  t_11 = true;
                }
              } else {
                {
                  t_11 = false;
                }
              }
            }
          }
        } else {
          {
            t_11 = false;
          }
        }
        var_3_ws_1 = t_11;
      }

      return var_2_result;
    }
  }

}
