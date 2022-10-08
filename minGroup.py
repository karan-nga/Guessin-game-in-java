def minGroups(movies, k):
    movies.sort()
    
    ret = []
    
    l = 0
    for r in range(len(movies)):        
        
        if (movies[r] - movies[l]) > k:
            
            ret.append(movies[l:r])
            
            l = r
    
   
    ret.append(movies[l:r+1])   
    return ret
