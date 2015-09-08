package SourcesPauli;

//@ model import org.jmlspecs.lang.*;


public class ListLinked extends java.lang.Object {

  public /*@ nullable @*/ SourcesPauli.LinkNode SourcesPauli_ListLinked_first;
  public /*@ nullable @*/ SourcesPauli.LinkNode SourcesPauli_ListLinked_last;
  /*@ invariant (\forall SourcesPauli.LinkNode n; \reach(this.SourcesPauli_ListLinked_first, SourcesPauli.LinkNode, SourcesPauli_LinkNode_next).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesPauli_LinkNode_next, SourcesPauli.LinkNode, SourcesPauli_LinkNode_next).has(((java.lang.Object)(n)))  ==  false);
    @*/
  /*@ invariant (this.SourcesPauli_ListLinked_first  ==  null && this.SourcesPauli_ListLinked_last  ==  null) || (\reach(this.SourcesPauli_ListLinked_first, SourcesPauli.LinkNode, SourcesPauli_LinkNode_next).has(((java.lang.Object)(this.SourcesPauli_ListLinked_last)))  ==  true && this.SourcesPauli_ListLinked_last.SourcesPauli_LinkNode_next  ==  null);
    @*/

  public ListLinked() {
    this.SourcesPauli_ListLinked_first = ((SourcesPauli.LinkNode)(null));
    this.SourcesPauli_ListLinked_last = ((SourcesPauli.LinkNode)(null));
    {
      SourcesPauli.LinkNode t_1;

      t_1 = new SourcesPauli.LinkNode();
      this.SourcesPauli_ListLinked_first = t_1;
      this.SourcesPauli_ListLinked_last = this.SourcesPauli_ListLinked_first;
    }
  }


  public SourcesPauli.LinkNode getFirst() {
    {
      return this.SourcesPauli_ListLinked_first;
    }
  }


  public void setFirst(SourcesPauli.LinkNode first) {
    SourcesPauli.LinkNode param_first_0;

    param_first_0 = first;
    {
      this.SourcesPauli_ListLinked_first = param_first_0;
    }
  }


  public SourcesPauli.LinkNode getLast() {
    {
      return this.SourcesPauli_ListLinked_last;
    }
  }


  public void setLast(SourcesPauli.LinkNode last) {
    SourcesPauli.LinkNode param_last_1;

    param_last_1 = last;
    {
      this.SourcesPauli_ListLinked_last = param_last_1;
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\exists SourcesPauli.LinkNode n; \reach(this.SourcesPauli_ListLinked_first, SourcesPauli.LinkNode, SourcesPauli_LinkNode_next).has(((java.lang.Object)(n))); n.SourcesPauli_LinkNode_data  ==  obj && n.SourcesPauli_LinkNode_next  ==  null);
    @*/
  public void add(java.lang.Object obj) {
    java.lang.Object param_obj_2;

    param_obj_2 = obj;
    {
      SourcesPauli.LinkNode t_2;
      java.lang.Object t_3;
      boolean t_4;

      t_2 = new SourcesPauli.LinkNode(param_obj_2);
      SourcesPauli.LinkNode var_1_linkNode = t_2;

      t_3 = this.SourcesPauli_ListLinked_first.getData();
      t_4 = t_3  ==  null;
      if (t_4) {
        {
          {
            {
              {
                {
                  this.SourcesPauli_ListLinked_first = var_1_linkNode;
                  this.SourcesPauli_ListLinked_last = var_1_linkNode;
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
                  this.SourcesPauli_ListLinked_last.setNext(var_1_linkNode);
                  this.SourcesPauli_ListLinked_last = var_1_linkNode;
                }
              }
            }
          }
        }
      }
    }
  }


  /*@ 
    @ requires (\exists SourcesPauli.LinkNode n; true; (\reach(this.SourcesPauli_ListLinked_first, SourcesPauli.LinkNode, SourcesPauli_LinkNode_next)).has(((java.lang.Object)(n))) && n.SourcesPauli_LinkNode_data  ==  obj);
    @ ensures (\exists SourcesPauli.LinkNode n; true; (\old(\reach(this.SourcesPauli_ListLinked_first, SourcesPauli.LinkNode, SourcesPauli_LinkNode_next)).has(((java.lang.Object)(n))) && n.SourcesPauli_LinkNode_data  ==  obj) ==> (\reach(this.SourcesPauli_ListLinked_first, SourcesPauli.LinkNode, SourcesPauli_LinkNode_next).has(((java.lang.Object)(n)))  ==  false && (\forall SourcesPauli.LinkNode m; \old(\reach(this.SourcesPauli_ListLinked_first, SourcesPauli.LinkNode, SourcesPauli_LinkNode_next)).has(((java.lang.Object)(m))) && m  !=  n; \reach(this.SourcesPauli_ListLinked_first, SourcesPauli.LinkNode, SourcesPauli_LinkNode_next).has(((java.lang.Object)(m))))));
    @*/
  public void remove(java.lang.Object obj) {
    java.lang.Object param_obj_3;

    param_obj_3 = obj;
    {
      java.lang.Object t_14;
      boolean t_15;
      SourcesPauli.LinkNode var_2_currentNode = this.SourcesPauli_ListLinked_first;

      t_14 = this.SourcesPauli_ListLinked_first.getData();
      t_15 = param_obj_3.equals(t_14);
      if (t_15) {
        {
          {
            {
              {
                {
                  SourcesPauli.LinkNode t_7;
                  boolean t_8;

                  t_7 = this.SourcesPauli_ListLinked_first.getNext();
                  t_8 = t_7  ==  null;
                  if (t_8) {
                    {
                      {
                        {
                          {
                            {
                              SourcesPauli.LinkNode t_5;

                              this.SourcesPauli_ListLinked_first.setData(null);
                              t_5 = new SourcesPauli.LinkNode();
                              this.SourcesPauli_ListLinked_first = t_5;
                              this.SourcesPauli_ListLinked_last = this.SourcesPauli_ListLinked_first;
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
                              SourcesPauli.LinkNode t_6;

                              var_2_currentNode.setData(null);
                              t_6 = var_2_currentNode.getNext();
                              var_2_currentNode = t_6;
                              this.SourcesPauli_ListLinked_first = var_2_currentNode;
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
                  boolean var_3_wasDeleted = false;
                  boolean var_4_ws_1;

                  var_4_ws_1 = ! var_3_wasDeleted;
                  while (var_4_ws_1) {
                    SourcesPauli.LinkNode t_9;
                    boolean t_13;

                    t_9 = var_2_currentNode.getNext();
                    SourcesPauli.LinkNode var_5_nextNode = t_9;

                    t_13 = var_5_nextNode  !=  null;

                    if (t_13) {
                      {
                        {
                          {
                            {
                              {
                                java.lang.Object t_11;
                                boolean t_12;

                                t_11 = var_5_nextNode.getData();
                                t_12 = t_11.equals(param_obj_3);
                                if (t_12) {
                                  {
                                    {
                                      {
                                        {
                                          {
                                            SourcesPauli.LinkNode t_10;

                                            t_10 = var_5_nextNode.getNext();
                                            var_2_currentNode.setNext(t_10);
                                            var_5_nextNode = ((SourcesPauli.LinkNode)(null));
                                            var_3_wasDeleted = true;
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
                                            var_2_currentNode = var_5_nextNode;
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
                    var_4_ws_1 = ! var_3_wasDeleted;
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
