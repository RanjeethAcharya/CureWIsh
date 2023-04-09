try (PrintWriter out = response.getWriter()) {
            String gender=request.getParameter("type");
            int age=Integer.parseInt(request.getParameter("age"));
            int systolic=Integer.parseInt(request.getParameter("systolic"));
            int diastolic=Integer.parseInt(request.getParameter("diastolic"));
            if(isNaN(systolic) || isNaN(diastolic))
             {
             out.println("Please enter valid numbers");
             }
    
            else if(systolic <= 60 || diastolic <= 40)
            {
             out.println("Please enter your numbers correctly");
            }
            else if(systolic >= 180 || diastolic >= 120)
            {
             out.println("Hypertensive Crisis:");
             out.println("If you have high blood pressure, the best way to prevent a hypertensive crisis is to manage your blood pressure every day. Here’s how you can do it:\n" +"\n" +"Keep taking medicines your provider prescribed for you — even if you feel fine.\n" +"Check your blood pressure regularly at home.\n" +"Contact your provider if your blood pressure is high.\n" +"Eat a healthy diet low in salt.\n" +"Exercise regularly.\n" +"Avoid tobacco products.");
            }
            else if(systolic >= 140 || diastolic <= 80)
            {
             out.println("Isolated systolic hypertension:");
             out.println("Your systolic blood pressure is elevated. Depending on the level it needs to be confirmed within a certain time (140-159mmHg - 2 months; 160-179mmHg - 1 month; >180mmHg - 1-7 days).You may also need to see a specialist. Your General Practitioner can advise you about lifestyle risk reduction and/or medication to lower your blood pressure.");
            }
            else if(systolic >= 140 || diastolic >= 90)
            {
             out.println("Stage 2 Hypertension");
            }
           else if(systolic >= 130 || diastolic >= 80)
           {
            out.println("Stage 1 Hypertension");
           }
           else if(systolic >= 120 && diastolic >= 60)
           {
             out.println("Elevated Blood Pressure");
             out.println("Your blood pressure is elevated. It should be confirmed within 1 week and you may also need to see a specialist in this time. Your General Practitioner can advise you about lifestyle risk reduction and/or medication to lower your blood pressure.");
           }
           else if(systolic >= 90 || diastolic >= 60)
           {
            out.println("Normal Blood Pressure");
           }
          else
           {
              out.println("Hypotension");
        }
        }
            String gender=request.getParameter("type");
            int age=Integer.parseInt(request.getParameter("age"));
            int systolic=Integer.parseInt(request.getParameter("systolic"));
            int diastolic=Integer.parseInt(request.getParameter("diastolic"));
            Class.forName("com.mysql.jdbc.Driver");
            Connection  con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/curewish","root","aadya");
            PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into bloodpressure values(?,?,?,?)");
            ps.setString(1,gender);
            ps.setInt(2, age);
            ps.setInt(3,systolic);
            ps.setInt(4, diastolic);
            ps.executeUpdate();
    }