class Solution {
        public int maxArea(int[] h) {
                int s = 0 , e = h.length-1;
                        int m=0;

                                while(s<e){
                                            int d = e - s;
                                                        int min = Math.min(h[s],h[e]);
                                                                    int litre = min * d;
                                                                                m = Math.max(m,litre);
                                                                                            if(h[s]<h[e]){
                                                                                                            s++;
                                                                                                                        }else if(h[e]<h[s]){
                                                                                                                                        e--;
                                                                                                                                                    }else{
                                                                                                                                                                    s++;
                                                                                                                                                                                    e--;
                                                                                                                                                                                                }
                                                                                                                                                                                                        }
                                                                                                                                                                                                                return m;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    }