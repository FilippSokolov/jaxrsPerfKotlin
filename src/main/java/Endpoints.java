


import com.sun.xml.internal.ws.client.sei.ResponseBuilder;

import javax.ws.rs.*;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@Path(value = "/helloClass")
public class Endpoints extends AbstractEndpoint implements InterfaceEndpoints {

    @GET
    public String getMessageForm() {
        return "<form action=\"helloOlga/sayHello\" method=\"GET\">\n" +
                " Name <input id=\"name\" name=\"name\"/> " +
                "<input type=\"submit\" />\n" +
                "  </form>";
    }

    public String interfaceDo() {
        return null;
    }

    @POST
    public Response createApplianceSoftwareVersion(HttpHeaders headers, Long applianceId) {
        return (Response) new Object();
    }

    @Path("sayHello")
    @GET
    public String doSayHelloWithRequestParam(@QueryParam("name") List<String> name) {
        return "Hi there " + name;

    }

////    @GET
////    @Produces("text/plain")
////    public String getMessage2() {
////        return "Hello2";
////    }
//
//
//    @GET
//    @Path(value = "/ext")
//    public String getMessage3() {
//        return "Hello3";
//    }
//
//
////====================================================================================//
//    //GET
////====================================================================================//
//
//    @GET
//    @Path(value = "/ext1")
//    @Produces("application/atom+xml")
//    public String say1() {
//        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n" +
//
//                "<feed xmlns=\"http://www.w3.org/2005/Atom\">" + "\n" +
//
//                "<title>Example Feed</title>" + "\n" +
//                "<subtitle>A subtitle.</subtitle>" + "\n" +
//                "<link href=\"http://example.org/feed/\" rel=\"self\" />" + "\n" +
//                "<link href=\"http://example.org/\" />" + "\n" +
//                "<id>urn:uuid:60a76c80-d399-11d9-b91C-0003939e0af6</id>" + "\n" +
//                "<updated>2003-12-13T18:30:02Z</updated>" + "\n" +
//
//                "<entry>" + "\n" +
//                "<title>Atom-Powered Robots Run Amok</title>" + "\n" +
//                "<link href=\"http://example.org/2003/12/13/atom03\" />" + "\n" +
//
//                "<content type=\"xhtml\">" + "\n" +
//                "<div xmlns=\"http://www.w3.org/1999/xhtml\">" + "\n" +
//                "<p>This is the entry content.</p>" + "\n" +
//                "</div>" + "\n" +
//                "</content>" + "\n" +
//                "<author>" + "\n" +
//                "<name>John Doe</name>" + "\n" +
//                "<email>johndoe@example.com</email>" + "\n" +
//                "</author>" + "\n" +
//
//                "</entry>" + "\n" +
//
//                "</feed>";
//    }
//
//    //// TODO: 23/09/2015
//    @GET
//    @Path(value = "/ext2")
//    @Produces({"image/jpeg,image/png"})
//    public String say2() {
//        return "<?xml version=\"1.0\"?>" + "<hello> Hello image/jpeg,image/png" + "</hello>";
//    }
//
//
//    @GET
//    @Path(value = "/ext3")
//    @Produces("application/json")
//    public String say3() {
//        return "{" + "\n" +
//                "\"firstName\": \"json F\"," + "\n" +
//                "\"lastName\": \"json L\"," + "\n" +
//                "}";
//    }
//
//
//    @GET
//    @Path(value = "/ext4")
//    @Produces("application/xml")
//    public String say4() {
//        return "<?xml version=\"1.0\"?>" + "<hello> Hello xml" + "</hello>";
//    }
//
//
//    @GET
//    @Path(value = "/ext5")
//    @Produces("text/html")
//    public String say5() {
//        return "<html> " + "<title>" + "Hello HTML title" + "</title>" + "<body><h1>" + "Hello HTML" + "</body></h1>" + "</html> ";
//    }
//
//
//    @GET
//    @Path(value = "/ext6")
//    @Produces("text/plain")
//    public String say6() {
//        return "tra la la";
//    }
//
//    /*
//    Any format
//     */
//    @GET
//    @Path(value = "/ext7")
//    @Produces("*/*")
//    public String say7() {
//        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
//    }
//
//
//    /*
//   Any format
//    */
//    @GET
//    @Path(value = "/ext8")
//    @Produces(MediaType.TEXT_XML)
//    public String say8() {
//        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
//    }
//
//    /*
//   Any format
//    */
//    @GET
//    @Path(value = "/ext9")
//    @Produces(MediaType.TEXT_HTML)
//    public String say9() {
//        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
//    }
//
//
//    /*
//   Any format
//    */
//    @GET
//    @Path(value = "/ext10")
//    @Produces(MediaType.TEXT_XML)
//    public String say10() {
//        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
//    }
//
//
//    @GET
//    @Produces({MediaType.APPLICATION_XML})
//    @Path("/ext11")
//    public String say11() {
//        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
//    }
//
//
//    @Path("sayHello/{name}")
//    @GET
//    public String doSayHello(@PathParam("name") String name) {
//        return "Hello there " + name;
//    }
//
//    @Path("sayHello/{age}")
//    @GET
//    public String doSayAge(@PathParam("age") String name) {
//        return "Hello there " + name;
//    }
//
//    @Path("sayHello{name}")
//    @GET
//    public String doSayHello2(@PathParam("name") String name) {
//        return "Hello there " + name;
//    }
//
////====================================================================================//
//    //GET
////====================================================================================//
//
//
//    @Path("sayHello1")
//    @POST
//    @Produces(MediaType.TEXT_PLAIN)
//    public String doSayHelloWithFormParam(@FormParam("name1") String name) {
//        return "Hi there1 " + name;
//    }
//
//    @POST
//    @Path(value = "/ext12")
//    @Produces("application/json")
//    public String say12() {
//        return "{" + "\n" +
//                "\"firstName\": \"json F111\"," + "\n" +
//                "\"lastName\": \"json L111\"," + "\n" +
//                "}";
//    }
//
//
//    //===========================
//    // MyTest
//    //===========================
//
//    @GET
//    @Path("sayHello/{name}" + "/some" + "/{value}")
//    public String getTest1() {
//        return "Hello3";
//    }
//
//    @GET
//    @Path("VVVVV/{name}" + "/some" + "/{value}")
//    public String getTest133() {
//        return "Hello3";
//    }
//
//    @GET
//    @Path("sayHe23llo/{name}" + "/some" + "/{value}")
//    public String getTest122() {
//        return "Hello3";
//    }
//
//    @GET
//    @Path("sayHello/{name}" + "/some")
//    public String getTest12() {
//        return "Hello3";
//    }
//
//    @GET
//    @Path("sayHello/some" + "some")
//    public String getTest13() {
//        return "Hello3";
//    }
//
//    @GET
//    @Path("users/{username: [a-zA-Z][a-zA-Z_0-9]}")
//    public String getTest4() {
//        return "Hello3";
//    }
//
//    @GET
//    @Path("us[a-zA-Z][a-zA-Z_0-9]ers/{username: [a-zA-Z][a-zA-Z_0-9]}")
//    public String getTest5() {
//        return "Hello3";
//    }
//
////    @GET
////    @Path("sayHello/somesome")
////    public String getTest14() {
////        return "Hello3";
////    }
//
//    @PermitAll
//    @POST
//    @Path("/TEST")
//    @Consumes("application/json")
//    @Produces("application/json")
//    public Response insert(User user) {
//
//        ResponseBuilder builder = Response.status(Response.Status.BAD_REQUEST);
//        builder.expires(new Date());
//
//        try {
//
//            Long idUser = (long) UserDao.getInstance().insertU(user);
//            user.setId(idUser);
//            builder.status(Response.Status.OK).entity(user);
//
//        } catch (SQLException e) {
//
//            builder.status(Response.Status.INTERNAL_SERVER_ERROR);
//        }
//
//        return builder.build();
//    }
//
//
//    ////////////////////
//
//
//    @ApiOperation(value = "Creates a new appliance software version for a software function model",
//            notes = "Creates a new appliance software version for a software function model",
//            response = BaseResponse.class)
//    @ApiResponses(value = {@ApiResponse(code = 200, message = "Successful operation"),
//            @ApiResponse(code = 400, message = "In case of any error", response = ErrorCodeDto.class)})
//    @Path("/{applianceId}/versions")
//    @POST
//    public Response createApplianceSoftwareVersion(@Context HttpHeaders headers,
//                                                   @ApiParam(value = "Id of the Appliance Model", required = true) @PathParam("applianceId") Long applianceId, @ApiParam(required = true) ApplianceSoftwareVersionDto asvDto) {
//
//        logger.info("Creating an Appliance Software Version");
//        this.userContext.setUser(OscAuthFilter.getUsername(headers));
//        this.apiUtil.setIdAndParentIdOrThrow(asvDto, null, applianceId, "Appliance Sofftware Version");
//
//        return this.apiUtil.getResponseForBaseRequest(this.addApplianceSoftwareVersionService, new BaseRequest<ApplianceSoftwareVersionDto>(asvDto));
//    }
//
/////////////////////////////////////
//
//    @PUT
//    @Path("/{id}")
//    @Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
//    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
//    @ApiOperation(value = "update Deliverabletypes")
//    @ApiResponses(value = { @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Returns", response = DeliverableTypesModel.class),
//            @ApiResponse(code = HttpURLConnection.HTTP_UNAUTHORIZED, message = "Unauthorized", response = ExceptionModel.class),
//            @ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "Not found", response = ExceptionModel.class),
//            @ApiResponse(code = HttpURLConnection.HTTP_FORBIDDEN, message = "Access denied", response = ExceptionModel.class) })
//    public Response updateDeliverableType(@Context HttpServletRequest request, @Context HttpHeaders header,
//                                          @Context Company company, @Context Locale locale, @Context User user,
//                                          @Context ServiceContext serviceContext, @BeanParam DeliverableTypeInputModel input,
//                                          @ApiParam(value = "id of dossier", required = true) @PathParam("id") long id);
//
//
//    /////////////////////////////
//
//    @GET
//    @Path("{machine}")
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    public Response getMachineMetric(@PathParam("machine") String machine) {
//        LOGGER.log(Level.INFO, "Fetching metrics for machine {0}", machine);
//
//        KafkaStreams ks = GlobalAppState.getInstance().getKafkaStreams();
//        HostInfo thisInstance = GlobalAppState.getInstance().getHostPortInfo();
//
//        Metrics metrics = null;
//
//        StreamsMetadata metadataForMachine = ks.metadataForKey(storeName, machine, new StringSerializer());
//
//        if (metadataForMachine.host().equals(thisInstance.host()) && metadataForMachine.port() == thisInstance.port()) {
//            LOGGER.log(Level.INFO, "Querying local store for machine {0}", machine);
//            metrics = getLocalMetrics(machine);
//        } else {
//            //LOGGER.log(Level.INFO, "Querying remote store for machine {0}", machine);
//            String url = "http://" + metadataForMachine.host() + ":" + metadataForMachine.port() + "/metrics/remote/" + machine;
//            metrics = Utils.getRemoteStoreState(url, 2, TimeUnit.SECONDS);
//            LOGGER.log(Level.INFO, "Metric from remote store at {0} == {1}", new Object[]{url, metrics});
//        }
//
//        return Response.ok(metrics).build();
//    }
//
//
//    /////////////////////////////////
//
//    /**
//     * When a client has a chunk, it registers as a seeder
//     */
//    @Path("registerclientseeder")
//    @PUT
//    @Produces(MediaType.TEXT_PLAIN)
//    public String registerClientSeeder(@QueryParam("file_hash") String file_hash,
//                                       @QueryParam("chunk_hash") String chunk_hash,
//                                       @QueryParam("chunk_id") String chunk_id,
//                                       @QueryParam("ip") String ip,
//                                       @QueryParam("port") String port) {
//
//        String query = "INSERT INTO chunk_owners(file_hash, chunk_hash, chunk_id, "
//                + "owner_ip, owner_port, is_seeder)"
//
//                + "VALUES('%s', '%s', %s, '%s', %s, 'f');".format(file_hash,
//                chunk_hash,
//                chunk_id,
//                ip,
//                port);
//
//       // runUpdate(query);
//        return null;
//    }
//
//    ///////////////////////////////////
//
//    /**
//     * Return complete results of a dataset version. Response contains a pagination URL to fetch the data in chunks.
//     *
//     * @return
//     * @throws DatasetVersionNotFoundException
//     * @throws InterruptedException
//     */
//    @GET @Path("run")
//    @Produces(APPLICATION_JSON) @Consumes(APPLICATION_JSON)
//    public InitialRunResponse run(@QueryParam("tipVersion") DatasetVersion tipVersion) throws DatasetVersionNotFoundException, InterruptedException, NamespaceException {
//        final VirtualDatasetUI virtualDatasetUI = getDatasetConfig();
//        final SqlQuery query = new SqlQuery(virtualDatasetUI.getSql(), virtualDatasetUI.getState().getContextList(), securityContext);
//        RunStartedListener listener = new RunStartedListener();
//        final JobUI job = executor.runQueryWithListener(query, QueryType.UI_RUN, datasetPath, version, listener);
//        // wait for job to start (or WAIT_FOR_RUN_HISTORY_S seconds).
//        boolean success = listener.await(WAIT_FOR_RUN_HISTORY_S, TimeUnit.SECONDS);
//        if (!success) {
//            throw new InterruptedException("Starting a query timed out after " + WAIT_FOR_RUN_HISTORY_S +
//                    " seconds, please try again.");
//        }
//
//        // tip version is optional, as it is only needed when we are navigated back in history
//        // otherwise assume the current version is at the tip of the history
//        tipVersion = tipVersion != null ? tipVersion : virtualDatasetUI.getVersion();
//        final History history = tool.getHistory(datasetPath, virtualDatasetUI.getVersion(), tipVersion);
//        return InitialRunResponse.of(newDataset(virtualDatasetUI, tipVersion), job.getJobId(), history);
//    }
//
//
//
//    //////////////////////////
////    @Path("/{applianceId}/versions")
////    @POST
////
//
//    @PUT
//    @Path("/folder_format/{path: .*}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public FileFormatUI saveFolderFormat(FileFormat fileFormat, @PathParam("path") String path)
//            throws NamespaceException, SourceNotFoundException {
//        SourceFolderPath folderPath = SourceFolderPath.fromURLPath(sourceName, path);
//        sourceService.checkSourceExists(folderPath.getSourceName());
//        fileFormat.setFullPath(folderPath.toPathList());
//
//        PhysicalDatasetConfig physicalDatasetConfig = new PhysicalDatasetConfig();
//        physicalDatasetConfig.setName(folderPath.getFolderName().getName());
//        physicalDatasetConfig.setFormatSettings(fileFormat.asFileConfig());
//        physicalDatasetConfig.setType(DatasetType.PHYSICAL_DATASET_SOURCE_FOLDER);
//        physicalDatasetConfig.setFullPathList(folderPath.toPathList());
//        physicalDatasetConfig.setVersion(fileFormat.getVersion());
//        sourceService.createPhysicalDataset(folderPath, physicalDatasetConfig);
//        fileFormat.setVersion(physicalDatasetConfig.getVersion());
//        return new FileFormatUI(fileFormat, folderPath);
//    }
//
//
//    //////////////////////
//    final String COUNTRY_SELECTED_STATE = "CONSTANT";
//
//    @Path(COUNTRY_SELECTED_STATE)
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response createStateInCountrySelectingState(TestSessionDto testSessionDto) {
//        testSessionRepository.createSession(testSessionDto.getSessionId(),
//                new SessionStartedState(testSessionDto.getRequestId(),
//                        testSessionDto.getRelayState(),
//                        testSessionDto.getRequestIssuerId(),
//                        testSessionDto.getAssertionConsumerServiceUri(),
//                        Optional.<Boolean>absent(),
//                        Collections.<String>emptyList(),
//                        testSessionDto.getSessionExpiryTimestamp(),
//                        testSessionDto.getSessionId(),
//                        testSessionDto.getTransactionSupportsEidas()));
//        return Response.ok().build();
//    }
//
//
//    ///////////////////
//
//
//    final String COUNTRY_SELECTED_STATE = "CONSTANT";
//    public String temp1 = "Variable";
//
//    @Path(temp1)
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response createStateInCountrySelectingState2(TestSessionDto testSessionDto) {
//        testSessionRepository.createSession(testSessionDto.getSessionId(),
//                new SessionStartedState(testSessionDto.getRequestId(),
//                        testSessionDto.getRelayState(),
//                        testSessionDto.getRequestIssuerId(),
//                        testSessionDto.getAssertionConsumerServiceUri(),
//                        Optional.<Boolean>absent(),
//                        Collections.<String>emptyList(),
//                        testSessionDto.getSessionExpiryTimestamp(),
//                        testSessionDto.getSessionId(),
//                        testSessionDto.getTransactionSupportsEidas()));
//        return Response.ok().build();
//    }
//
//
////////////////////
//
//
//    @DELETE
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Path("unsubscribe")
//    public Response unsubscribe(InputStream input) {
//
//        EventExporterService service = get(EventExporterService.class);
//
//        try {
//            EventSubscriber sub = parseSubscriptionData(input);
//            service.subscribe(sub);
//        } catch (Exception e) {
//            log.error(e.getMessage());
//            return Response.status(BAD_REQUEST).entity(e.getMessage()).build();
//        }
//
//        return ok(EVENT_SUBSCRIPTION_REMOVED).build();
//    }
//
//
//////////////////////////////////////
//
//
//    @POST
//    @Path("fi.le/{file}")
//    @Produces(MediaType.TEXT_PLAIN)
//    @ApiOperation(value = "Replace this file with the file at the given URL")
//    @ApiResponses(value = {
//            @ApiResponse(code = 207, message = "Multiple responses available"),
//            @ApiResponse(code = 400, message = "Request contains invalid parameters")})
//    public Response setConnectorFileByURL(
//            String url,
//            @PathParam("file") String file,
//            @QueryParam("scope") String scope,
//            @QueryParam("nodeId") List<String> nodeId)
//    {
//        ApiRequester apiRequester = requesterBuilder(ControllerConnectorAPI.class)
//                .pathMethod("setConnectorFileByURL")
//                .httpMethod(POST)
//                .resolveTemplate("file", file)
//                .accept(MediaType.TEXT_PLAIN)
//                .entity(Entity.entity(url, MediaType.TEXT_PLAIN))
//                .build();
//
//        return forwardRequest(scope, apiRequester, nodeId);
//    }
//
//    @Path("AbstractRoot")
//    @GET
//    public String doSome1() {
//        return null;
//    }


//
//    /*@GET
//    @Path(value="/{lastName}")....33
//    @Produces(value="text/xml")
//    public ContactInfo getByLastName(@PathParam(value="lastName") String lastName) {
//        ...
//    }
//    @POST
//    @Consumes(value={"text/xml", "application/json"})
//    public void addContactInfo(ContactInfo contactInfo) {
//        ...
//    }*/
//
//
//    /*public static void main(String[] args) throws IOException {
//        HttpServer server = HttpServerFactory.create("http://localhost:9998/");
//        server.start();
//        System.out.println("Server running");
//        System.out.println("Visit: http://localhost:9998/helloworld");
//        System.out.println("Hit return to stop...");
//        System.in.read();
//        System.out.println("Stopping server");
//        server.stop(0);
//        System.out.println("Server stopped");
//    }*/
//

}
