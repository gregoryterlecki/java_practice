/*
  DEPTH FIRST SEARCH

  What is it?
  Depth first search is an algorithm for traversing tree or graph type data
  structures.

  psuedocode:
  depthFirstSearch(Graph G, node v){
    mark v as visited
    for all edges (v, w) adjacent to v
      if w is not labelled as discovered
        depthFirstSearch(G, w)
  }
}
*/
