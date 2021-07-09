<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html lang="en">
<head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content=" ">
        <meta name="author" content=" "> 
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/favicon.png"> 
        <title>Propintellect : : Dashboard</title> 
		
		<!-- DataTables -->
        <link href="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/buttons.bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/fixedHeader.bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/responsive.bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/scroller.bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/dataTables.colVis.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/plugins/datatables/fixedColumns.dataTables.min.css" rel="stylesheet" type="text/css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/magnific-popup/css/magnific-popup.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/jquery-datatables-editable/datatables.css" />
		
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/morris/morris.css"> 
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/core.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/components.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/icons.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/pages.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/menu.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/responsive.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/switchery/switchery.min.css">
        <script src="${pageContext.request.contextPath}/assets/js/modernizr.min.js"></script>
    </head>
    <body class="fixed-left"> 
        <div id="wrapper">
            <div class="topbar">
                <div class="topbar-left">
					<a href="index.html" class="logo">
                        <span>
                            <img src="${pageContext.request.contextPath}/assets/images/logo.png" alt="" height="30">
                        </span>
                        <i>
                            <img src="${pageContext.request.contextPath}/assets/images/logo_sm.png" alt="" height="28">
                        </i>
                    </a>
                </div>
 
                <div class="navbar navbar-default" role="navigation">
                    <div class="container"> 
                        <ul class="nav navbar-nav navbar-left">
                            <li>
                                <button class="button-menu-mobile open-left waves-effect">
                                    <i class="mdi mdi-menu"></i>
                                </button>
                            </li>
                            <li class="hidden-xs">
                                <form role="search" class="app-search">
                                    <input type="text" placeholder="Search..."
                                           class="form-control">
                                    <a href="#"><i class="fa fa-search"></i></a>
                                </form>
                            </li> 
                        </ul>
                         
                        <ul class="nav navbar-nav navbar-right">
                            <li class="dropdown user-box">
                                <a href="#" class="dropdown-toggle waves-effect user-link" data-toggle="dropdown" aria-expanded="true">
                                    <img src="${pageContext.request.contextPath}/assets/images/admin.png" alt="user-img" class="img-circle user-img">
                                </a>

                                <ul class="dropdown-menu dropdown-menu-right arrow-dropdown-menu arrow-menu-right user-list notify-list">
                                    <li>
                                        <h5>Hi, Propintellect</h5>
                                    </li>
                                    <li><a href=" "><i class="ti-user m-r-5"></i> Profile</a></li>
                                    <li><a href=""><i class="ti-power-off m-r-5"></i> Logout</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
             
            <div class="left side-menu">
                <div class="sidebar-inner slimscrollleft">
                    <div id="sidebar-menu">
                        <ul>
                        	<li class="menu-title">Navigation</li>
							<li>
                                <a href="index.html" class="waves-effect"><i class="mdi mdi-view-dashboard"></i><span> Dashboard </span></a>
                            </li>	 
							<li class="has_sub">
                                <a href="javascript:void(0);" class="waves-effect"><i class="mdi mdi-layers"></i><span> Home </span> <span class="menu-arrow"></span></a>
                                <ul class="list-unstyled">
                                    <li><a href="banner"> Banner Images</a></li>
                                    <li><a href="featuredproperty"> Featured Property</a></li>
                                    <li><a href="propertyforsale"> Property for Sale</a></li>
                                    <li><a href="featuredlocation"> Featured Locations</a></li>
                                    <li><a href="partners"> Partners</a></li>
                                </ul>
                            </li>
                            <li class="has_sub">
                                <a href="javascript:void(0);" class="waves-effect"><i class="mdi mdi-invert-colors"></i> <span> Property </span> <span class="menu-arrow"></span></a>
                                <ul class="list-unstyled">
                                    <li><a href="completed-property.html">Completed</a></li>
                                    <li><a href="under-construction-property.html">Under Construction</a></li>
                                    <li><a href="resale-property.html">Resales</a></li>
                                </ul>
                            </li>

                            <li class="has_sub">
                                <a href="property.html" class="waves-effect"><i class="mdi mdi-layers"></i><span> All Property </span></a>
                            </li>

                        </ul>
                    </div>
                    
                    <div class="clearfix"></div>

                    <div class="help-box">
                        <h5 class="text-muted m-t-0">For Help ?</h5>
                        <p class=""><span class="text-custom">Email:</span> <br/> support@support.com</p>
                        <p class="m-b-0"><span class="text-custom">Call:</span> <br/> (080) 123 456 789</p>
                    </div>

                </div>
            </div>
            
            <div class="content-page"> 
                <div class="content">
                    <div class="container">
                        <div class="row">
							<div class="col-xs-12">
								<div class="page-title-box">
                                    <h4 class="page-title">Home</h4>
                                    <ol class="breadcrumb p-0 m-0">
                                        <li>
                                            <a href="#">Home</a>
                                        </li> 
                                        <li class="active">
                                            Featured Locations
                                        </li>
                                    </ol>
                                    <div class="clearfix"></div>
                                </div>
							</div>
						</div>
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="card-box">
                                    <h4 class="header-title m-t-0">Add New Featured Locations</h4>
                                    <a href="addnewfeaturedlocation" type="button" class="btn btn-primary waves-effect w-md waves-light m-b-5">Add New</a>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="card-box table-responsive">
                                    <h4 class="m-t-0 header-title"><b>Featured Locations</b></h4>
                                    <table id="datatable" class="table table-striped table-bordered">
                                        <thead>
                                        <tr>
                                            <th>S.I No.</th>
                                            <th>Image</th>
                                            <th>Caption</th> 
                                            <th>Link</th> 
                                            <th>Actions</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
											<td>1</td> 
                                            <td><img src="${pageContext.request.contextPath}/assets/images/properties/1.jpg" width="80" height="50"/></td>
											<td> Caption</td> 
											<td>www.dfdhf.com</td>
                                            <td class="actions">
												<a href="editfeaturedlocation" class="on-default edit-row"><i class="fa fa-pencil"></i></a>
												<a href="#" class="on-default remove-row"><i class="fa fa-trash-o"></i></a>
											</td>
                                        </tr>
                                       
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
						
                    </div>
                </div>

                <footer class="footer text-right">
                    2018 � Propintellect. Powered by Vapptek.
                </footer>

            </div>
        </div>
        
        <script>
            var resizefunc = [];
        </script>
 
        <script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/detect.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/fastclick.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.blockUI.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/waves.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.slimscroll.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.scrollTo.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/switchery/switchery.min.js"></script> 
        <script src="${pageContext.request.contextPath}/plugins/waypoints/jquery.waypoints.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/counterup/jquery.counterup.min.js"></script> 
		<script src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
		<script src="${pageContext.request.contextPath}/plugins/raphael/raphael-min.js"></script> 
        <script src="${pageContext.request.contextPath}/assets/pages/jquery.dashboard.js"></script> 
        <script src="${pageContext.request.contextPath}/assets/js/jquery.core.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.app.js"></script>
		
		
		<script src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.js"></script>

        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.buttons.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/buttons.bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/jszip.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/pdfmake.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/vfs_fonts.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/buttons.html5.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/buttons.print.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.fixedHeader.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.keyTable.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.responsive.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/responsive.bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.scroller.min.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.colVis.js"></script>
        <script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.fixedColumns.min.js"></script>
		
		<script>
            $(document).ready(function () {
                $('#datatable').dataTable();
                $('#datatable-keytable').DataTable({keys: true});
                $('#datatable-responsive').DataTable();
                $('#datatable-colvid').DataTable({
                    "dom": 'C<"clear">lfrtip',
                    "colVis": {
                        "buttonText": "Change columns"
                    }
                });
                $('#datatable-scroller').DataTable({
                    ajax: "../plugins/datatables/json/scroller-demo.json",
                    deferRender: true,
                    scrollY: 380,
                    scrollCollapse: true,
                    scroller: true
                });
                var table = $('#datatable-fixed-header').DataTable({fixedHeader: true});
                var table = $('#datatable-fixed-col').DataTable({
                    scrollY: "300px",
                    scrollX: true,
                    scrollCollapse: true,
                    paging: false,
                    fixedColumns: {
                        leftColumns: 1,
                        rightColumns: 1
                    }
                });
            });
            TableManageButtons.init();

        </script>

    </body>
</html>