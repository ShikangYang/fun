<template>
    <div class="wrapper">
        <!-- header-->

        <el-row class="container">
            <home></home>
            <!-- body-->
        </el-row>

        <el-row>
            <el-col :span="24">
                <footer class="footer">
                    <!-- footer-->
                </footer>

            </el-col>
        </el-row>
    </div>
</template>

<script>
    import Home from './site/Home.vue';
    export default {
        name: 'app',
        components: {
            Home
        },
    }

</script>

<style>

</style>