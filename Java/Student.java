class Student{
         
        private int sid;
        private String sname;
        private Department department=new Department();
         
        public int getSid()
        {
             return sid;
        }
        public String getSname()
        {
            return sname;
        }
        public void setSid(int sid)
        {
           this.sid=sid;
        }
        public void setSname(String sname)
        {
            this.sname=sname;
        }
        public int getDid1()
        {
             return department.getDid();
         }
         public String getDname1()
        {
            return department.getDname();
        }
        public void setDid1(int did)
       {
           department.setDid(did);
        }
        public void setDname1(String dname)
        {
            department.setDname(dname);
        }
       
       
    }